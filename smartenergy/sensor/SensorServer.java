package distsys.smartenergy.sensor;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SensorServer {
    private static final int PORT = 9001;
    private Server server;
    private JmDNS jmdns;
    
    public void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
            .addService(new SensorServiceImpl())
            .build()
            .start();
            
        System.out.println("️ SensorService started on port " + PORT);
        
        // Register with jmDNS
        jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create(
            "_sensor-service._tcp.local.",
            "SensorService",
            PORT,
            "Smart Energy Sensor Service"
        );
        jmdns.registerService(serviceInfo);
        System.out.println(" Service registered with jmDNS");
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println(" Shutting down SensorService");
            stop();
        }));
    }
    
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
        if (jmdns != null) {
            jmdns.unregisterAllServices();
        }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        SensorServer server = new SensorServer();
        server.start();
        server.server.awaitTermination();
    }
}