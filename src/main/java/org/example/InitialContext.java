package org.example;

/**
 * @author Israel I. Rodriguez Espinoza
 */
public class InitialContext {

    public Object lookup(String name){
        if(name.equalsIgnoreCase(name)) {
            if (name.equalsIgnoreCase("Service1")) {
                System.out.println("Creating a new ServiceOne object");
                return new ServiceOne("ServiceOne");
            } else if (name.equalsIgnoreCase("Service2")) {
                System.out.println("Creating a new ServiceTwo object");
                return new ServiceTwo("ServiceTwo");
            }
        }
            return null;

    }
}
