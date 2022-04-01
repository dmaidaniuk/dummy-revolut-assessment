package io.guthub.dmaidaniuk.revolut.cloud.loadbalancer;

import io.guthub.dmaidaniuk.revolut.cloud.services.CloudService;
import io.guthub.dmaidaniuk.revolut.cloud.services.RemoteCloudService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class NetworkLoadBalancer implements LoadBalancer<RemoteCloudService> {

    private List<CloudService> networkServices = new ArrayList<>();

    public NetworkLoadBalancer() {
    }

    public Entry<String, List<CloudService>> register(String[] serviceNames, CloudService service, int instancesSize) {
        return null;
    }

    public List<CloudService> addService(String serviceName, List<CloudService> instances) {
        return null;
    }

}
