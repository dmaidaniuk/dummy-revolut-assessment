package io.guthub.dmaidaniuk.revolut.cloud.loadbalancer;

import io.guthub.dmaidaniuk.revolut.cloud.services.CloudService;
import io.guthub.dmaidaniuk.revolut.cloud.services.RemoteCloudService;
import java.util.ArrayList;
import java.util.List;

public interface RemoteNetworkLoadBalancer extends LoadBalancer<RemoteCloudService> {
    default List<CloudService> addService(String serviceName, List<CloudService> instancesList) {
        return new ArrayList<>(instancesList.size());
    }
}
