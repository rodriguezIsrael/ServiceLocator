package org.example;
/**
 * @author Israel I. Rodriguez Espinoza
 */
public class DemoServiceLocator {
    public static final void main(String... ssds) {

        Service service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();

        service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
