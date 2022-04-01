package io.guthub.dmaidaniuk.revolut.cloud.loadbalancer;

import io.guthub.dmaidaniuk.revolut.cloud.services.CloudService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public interface LoadBalancer<T extends CloudService> {

    Map<String, List<CloudService>> services = new HashMap<>();

    default List<CloudService> addService(String providerName, List<CloudService> list) {
        if (list.size() > 10) {
            throw new RuntimeException("Allowed only 10 instances to be registered! Your size is: " + list.size());
        } else {
            services.put(providerName, list);
            return list;
        }
    }

    Entry<String, List<CloudService>> register(String[] var1, CloudService service, int count);

}
