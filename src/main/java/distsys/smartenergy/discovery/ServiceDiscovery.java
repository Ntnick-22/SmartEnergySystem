package distsys.smartenergy.discovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;

public class ServiceDiscovery {

    private ServiceInfo serviceInfo;

    public ServiceInfo discoverService(String serviceType) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(serviceType, new ServiceListener() {
                @Override
                public void serviceAdded(ServiceEvent event) {}

                @Override
                public void serviceRemoved(ServiceEvent event) {}

                @Override
                public void serviceResolved(ServiceEvent event) {
                    serviceInfo = event.getInfo();
                }
            });

            Thread.sleep(2000);
            jmdns.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return serviceInfo;
    }
}
