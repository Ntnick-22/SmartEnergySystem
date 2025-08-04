package distsys.smartenergy.report;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ReportServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50053;  // Report port

        // Start gRPC server
        Server server = ServerBuilder.forPort(port)
                .addService(new ReportServiceImpl())
                .build()
                .start();

        System.out.println("Report Server started on port " + port);

        // jmDNS registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_report._tcp.local.", "report", port, "Report Service");
        jmdns.registerService(serviceInfo);
        System.out.println("Report Service registered via jmDNS");

        server.awaitTermination();
    }
}
