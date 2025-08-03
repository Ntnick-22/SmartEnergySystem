package distsys.smartenergy.control;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ControlServer {

    public static void main(String[] args) throws Exception {
        int port = 50052;
        Server server = ServerBuilder.forPort(port)
                .addService(new ControlServiceImpl())
                .build()
                .start();

        System.out.println("Control Server started on port " + port);
        server.awaitTermination();
    }
}
