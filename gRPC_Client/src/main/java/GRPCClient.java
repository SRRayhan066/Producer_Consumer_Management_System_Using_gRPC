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
                System.out.println("Exit");
                break;
            }
            else if(option == 1){
                System.out.print("Enter Your E-mail: ");
                String email = sc.nextLine();
                System.out.print("Enter Your Password: ");
                String password = sc.nextLine();
                createAccount(email,password,userStub);
            }else if(option == 2){
                System.out.println("2 is choosed");
            }else if(option == 3) {
                System.out.println("3 is choosed");
            }else if(option == 4){
                System.out.println("4 is choosed");
            }else{
                System.out.println("Invalid option.");
            }
        }
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
        System.out.println("4. Update Profile");
        System.out.println("0. Exit\n");
        System.out.print("Choose option: ");
    }
}
