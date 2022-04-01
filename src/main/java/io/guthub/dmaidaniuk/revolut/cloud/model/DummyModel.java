package io.guthub.dmaidaniuk.revolut.cloud.model;

public class DummyModel implements SimpleModel {
    public DummyModel() {
    }

    public void doSomething() {
        System.out.println("Called doSomething() method from class " + this.getClass().getCanonicalName());
    }
}
