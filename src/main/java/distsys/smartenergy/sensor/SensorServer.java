package distsys.smartenergy.sensor;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SensorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051; //  sensor port

        // Start gRPC server
        Server server = ServerBuilder.forPort(port)
                .addService(new SensorServiceImpl())
                .build()
                .start();

        System.out.println("Sensor Server started on port " + port);

        // jmDNS registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_sensor._tcp.local.", "sensor_service", port, "sensor gRPC service");
        jmdns.registerService(serviceInfo);
        System.out.println("SensorService registered with jmDNS");

        server.awaitTermination();
    }
}

