package distsys.smartenergy.control;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ControlServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052; // control port

        Server server = ServerBuilder.forPort(port)
                .addService(new ControlServiceImpl())
                .build()
                .start();

        System.out.println("Control Server started on port " + port);

        // jmDNS registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_control._tcp.local.", "control_service", port, "control gRPC service");
        jmdns.registerService(serviceInfo);
        System.out.println("ControlService registered with jmDNS");

        server.awaitTermination();
    }
}

