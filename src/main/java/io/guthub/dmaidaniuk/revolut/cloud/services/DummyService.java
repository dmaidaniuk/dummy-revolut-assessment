package io.guthub.dmaidaniuk.revolut.cloud.services;

import io.guthub.dmaidaniuk.revolut.cloud.model.DummyModel;
import io.guthub.dmaidaniuk.revolut.cloud.model.SimpleModel;
import java.util.UUID;

public class DummyService implements CloudService {

    private String instanceName;

    public DummyService() {
        this.instanceName = "DummyInstance_" + UUID.randomUUID();
    }

    public DummyService(String instanceName) {
        this.instanceName = instanceName;
    }

    public void doSomething() {
        SimpleModel model = new DummyModel();
        model.doSomething();
    }
}
