package org.example;

/**
 * @author Israel I. Rodriguez Espinoza
 */
public class ServiceOne implements Service {

    private String name;

    public ServiceOne(String name){
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
