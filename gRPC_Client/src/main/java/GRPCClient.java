import com.example.grpc.User;
import com.example.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",4040).usePlaintext().build();

        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);

        User.RegistrationRequest registrationRequest = User.RegistrationRequest.newBuilder().setEmail("shafikulrahman66@gmail.com").setPassword("123456").build();
        User.APIResponse registrationResponse = userStub.registration(registrationRequest);
        System.out.println(registrationResponse.getResponseMessage());
//        User.LoginRequest loginRequest = User.LoginRequest.newBuilder().setUserName("Rayhan").setPassword("Rayhan").build();
//        User.APIResponse response = userStub.login(loginRequest);
//        System.out.println(response.getResponseMessage());
    }
}
