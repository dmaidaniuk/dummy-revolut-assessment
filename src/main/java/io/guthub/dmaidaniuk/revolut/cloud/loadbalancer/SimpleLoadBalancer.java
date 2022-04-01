package io.guthub.dmaidaniuk.revolut.cloud.loadbalancer;

import io.guthub.dmaidaniuk.revolut.cloud.services.CloudService;
import io.guthub.dmaidaniuk.revolut.cloud.services.DummyService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;

public class SimpleLoadBalancer implements LoadBalancer<CloudService> {

    public SimpleLoadBalancer() {
    }

    public Entry<String, List<CloudService>> register(String[] serviceNames, CloudService service, int instancesSize) {
        if (serviceNames.length > 10) {
            throw new RuntimeException();
        } else {
            List<CloudService> cloudServices = (List)SimpleLoadBalancer.services.get(service.getClass().getSimpleName());
            if (cloudServices == null) {
                cloudServices = new ArrayList<>();
            }

            List<CloudService> services = new ArrayList<>(serviceNames.length);
            int var7 = serviceNames.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                String cloudServiceName = serviceNames[var8];
                CloudService newService = new DummyService(cloudServiceName);
                services.add(newService);
            }

            this.addService("", (List)cloudServices);
            this.addService(CloudService.class.getSimpleName() + UUID.randomUUID(), services);
            return null;
        }
    }
}
