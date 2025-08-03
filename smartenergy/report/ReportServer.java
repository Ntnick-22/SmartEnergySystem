package distsys.smartenergy.report;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ReportServer {

    public static void main(String[] args) throws Exception {
        int port = 50053;
        Server server = ServerBuilder.forPort(port)
                .addService(new ReportServiceImpl())
                .build()
                .start();

        System.out.println("Report Server started on port " + port);
        server.awaitTermination();
    }
}
