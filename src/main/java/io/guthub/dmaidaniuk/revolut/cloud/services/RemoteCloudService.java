package io.guthub.dmaidaniuk.revolut.cloud.services;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RemoteCloudService extends CloudService {
    Map<URL, RemoteCloudService> services = new HashMap<>();

    default List<RemoteCloudService> addService(String serviceName, List<RemoteCloudService> list) {
        return new ArrayList<>(list.size());
    }
}
