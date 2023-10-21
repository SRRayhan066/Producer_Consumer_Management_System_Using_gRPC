package Services;

import com.example.grpc.User;
import com.example.grpc.userGrpc;
import io.grpc.stub.StreamObserver;
import org.mindrot.jbcrypt.BCrypt;

import java.beans.Statement;
import java.sql.*;

public class userService extends userGrpc.userImplBase {

    String url = "jdbc:mysql://localhost:3306/grpc";
    String user = "root";
    String password = "";

    @Override
    public void registration(User.RegistrationRequest request, StreamObserver<User.APIResponse> responseObserver) {
//        super.registration(request, responseObserver);
        String userEmail = request.getEmail();
        String userPassword = HashPassword(request.getPassword());

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        try(Connection connection = DriverManager.getConnection(url,user,password)){

            String checkingQuery = "SELECT email FROM authentication WHERE email=?";
            PreparedStatement checkStatement = connection.prepareStatement(checkingQuery);
            checkStatement.setString(1,userEmail);
            ResultSet checkResultSet = checkStatement.executeQuery();

            if(!checkResultSet.next()){
                String insertingQuery = "INSERT into authentication(email,password) VALUES(?,?)";
                PreparedStatement insertingStatement = connection.prepareStatement(insertingQuery);
                insertingStatement.setString(1,userEmail);
                insertingStatement.setString(2,userPassword);

                int check = insertingStatement.executeUpdate();
                if(check == 1){
                    response.setResponseCode("200").setResponseMessage("Successfully Registered!!");
                }else{
                    response.setResponseCode("400").setResponseMessage("Failed!!");
                }
            }else{
                response.setResponseCode("400").setResponseMessage("Already Registered.");
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
//        super.login(request, responseObserver);

        String userEmail = request.getEmail();
        String userPassword = HashPassword(request.getPassword());

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        try(Connection connection = DriverManager.getConnection(url,user,password);){
            String checkQuery = "SELECT password FROM authentication WHERE email=?";
            PreparedStatement checkingStatement = connection.prepareStatement(checkQuery);
            checkingStatement.setString(1,userEmail);
            ResultSet resultSet = checkingStatement.executeQuery();

            if(resultSet.next()){
                String temp = resultSet.getString("password");
                if(userPassword.equals(resultSet.getString("password"))){
                    response.setResponseCode("200").setResponseMessage("Successfully Logged in").build();
                }else{
                    response.setResponseCode("400").setResponseMessage("Given Password "+userPassword+" | Database Password "+resultSet.getString("password")).build();
                }
            }else{
                response.setResponseCode("400").setResponseMessage("This account is not registered.").build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void createProfile(User.CreateProfileRequest request, StreamObserver<User.APIResponse> responseObserver) {
//        super.createProfile(request, responseObserver);
        String userEmail = request.getEmail();
        String userName = request.getName();
        String department = request.getDepartment();
        String batch = request.getBatch();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        try(Connection connection = DriverManager.getConnection(url,user,password)){
            String query = "SELECT email FROM userprofile WHERE email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,userEmail);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                String insertingQuery = "INSERT into userprofile(email,name,department,batch) VALUE(?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(insertingQuery);
                statement.setString(1,userEmail);
                statement.setString(2,userName);
                statement.setString(3,department);
                statement.setString(4,batch);

                int check = statement.executeUpdate();
                if(check == 1){
                    response.setResponseCode("200").setResponseMessage("Account is created successfully!!");
                }else{
                    response.setResponseCode("400").setResponseMessage("Failed to create account.");
                }
            }else{
                response.setResponseCode("400").setResponseMessage("Account already exists");
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
//        super.logout(request, responseObserver);
        System.out.println("Inside the logout");
    }

    private String HashPassword(String password) {
        String fixedSalt = "$2a$12$9z7vgy88gfgN3n.wNm3qRu";
        return BCrypt.hashpw(password, fixedSalt);
    }
}
