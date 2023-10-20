import Services.userService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(4040).addService(new userService()).build();
        server.start();

        System.out.println("server is running on "+server.getPort());
        server.awaitTermination();
    }
}
