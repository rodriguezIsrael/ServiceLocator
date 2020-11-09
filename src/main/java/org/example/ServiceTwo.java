package org.example;

/**
 * @author Israel I. Rodriguez Espinoza
 */
public class ServiceTwo implements Service {

    private String name;

    public ServiceTwo(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
