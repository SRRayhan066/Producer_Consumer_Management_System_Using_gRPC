import com.example.grpc.User;
import com.example.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class GRPCClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",4040).usePlaintext().build();
        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);
        Scanner sc = new Scanner(System.in);

        while(true){
            showMenu();
            int option = sc.nextInt();
            sc.nextLine();

            if(option == 0){
                System.out.println("\nProgram is closed.\n");
                break;
            }else if(option == 1){
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                System.out.print("Enter Your Password: ");
                String password = sc.nextLine();
                createAccount(email,password,userStub);
            }else if(option == 2){
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                System.out.print("Enter Your Password: ");
                String password = sc.nextLine();
                loginAccount(email,password,userStub);
            }else if(option == 3) {
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                System.out.print("Enter Your Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Your Department Name: ");
                String department = sc.nextLine();
                System.out.print("Enter Your Batch: ");
                String batch = sc.nextLine();
                createProfile(email,name,department,batch,userStub);
            }else if(option == 4){
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                viewProfile(email,userStub);
            }else if (option == 5){
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                updateProfile(email,userStub,sc);
            }else{
                System.out.println("Invalid option.");
            }
        }
    }

    private static void updateProfile(String email, userGrpc.userBlockingStub userStub,Scanner sc) {
        User.ShowUserProfileRequest viewRequest = User.ShowUserProfileRequest.newBuilder().setEmail(email).build();
        User.ShowUserProfileRequestResponse viewResponse = userStub.showProfile(viewRequest);
        String prevName = viewResponse.getName();
        String prevDepartment = viewResponse.getDepartment();
        String prevBatch = viewResponse.getBatch();

        System.out.println("Previous Name: "+prevName);
        System.out.print("New Name: ");
        String newName = sc.nextLine();

        System.out.println("Previous Department: "+prevDepartment);
        System.out.print("New Department: ");
        String newDepartment = sc.nextLine();

        System.out.println("Previous Batch: "+prevBatch);
        System.out.print("New Batch: ");
        String newBatch = sc.nextLine();

        User.UpdateProfileRequest updateProfileRequest = User.UpdateProfileRequest.newBuilder().setEmail(email).setName(newName)
                .setDepartment(newDepartment).setBatch(newBatch).build();
        User.APIResponse response = userStub.updateProfile(updateProfileRequest);
        System.out.println("\n"+response.getResponseMessage()+"\n");
    }

    private static void viewProfile(String email, userGrpc.userBlockingStub userStub) {
        User.ShowUserProfileRequest viewRequest = User.ShowUserProfileRequest.newBuilder().setEmail(email).build();
        User.ShowUserProfileRequestResponse response = userStub.showProfile(viewRequest);
        String name = response.getName();
        String department = response.getDepartment();
        String batch = response.getBatch();
        if(name == "null" || department == "null" || batch == "null"){
            System.out.println("This account doesn't exist\n");
        }else{
            System.out.println("Email: "+email);
            System.out.println("Name: "+name);
            System.out.println("Department: "+department);
            System.out.println("Batch: "+batch+"\n");
        }
    }

    private static void createProfile(String email, String name, String department, String batch, userGrpc.userBlockingStub userStub) {
        User.CreateProfileRequest createProfileRequest = User.CreateProfileRequest.newBuilder().
                setEmail(email)
                .setName(name)
                .setDepartment(department)
                .setBatch(batch).build();
        User.APIResponse createProfileResponse = userStub.createProfile(createProfileRequest);
        System.out.println("\n"+createProfileResponse.getResponseMessage()+"\n");
    }

    private static void loginAccount(String email, String password, userGrpc.userBlockingStub userStub) {
        User.LoginRequest loginRequest = User.LoginRequest.newBuilder().setEmail(email).setPassword(password).build();
        User.APIResponse loginResponse = userStub.login(loginRequest);
        System.out.println("\n"+loginResponse.getResponseMessage()+"\n");
    }

    private static void createAccount(String email,String password,userGrpc.userBlockingStub userStub) {
        User.RegistrationRequest registrationRequest = User.RegistrationRequest.newBuilder().setEmail(email).setPassword(password).build();
        User.APIResponse registrationResponse = userStub.registration(registrationRequest);
        System.out.println("\n"+registrationResponse.getResponseMessage()+"\n");
    }

    private static void showMenu() {
        System.out.println("Select what you want to do..\n");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("3. Create Profile");
        System.out.println("4. View Profile");
        System.out.println("5. Update Profile");
        System.out.println("0. Exit\n");
        System.out.print("Choose option: ");
    }
}
