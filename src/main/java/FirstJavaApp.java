import basics.access.customer.Customer;
import basics.access.customer.VIPCustomer;

import java.util.Arrays;

public class FirstJavaApp {
    public static void main(String[] args) {
//public = accessible from anywhere; static - can be used without an instance; void means it won't return anything
//methods start with lower case, classes with Upper
//        System.out.println("Hello " + args[0]);
// system.out.println only accepts 1 argument
// javac .\FirstJavaApp.java - compiles class - creates class file
// java FirstJavaApp - run compiled class
// java FirstJavaApp <arg> - run compiled class with arguments
        Customer customer = new VIPCustomer(); //can also write without import as customer.Customer (but not good practice)
        // instantiating object^
        customer.setName("Madi");
        customer.setInterests(Arrays.asList("coding"));

        System.out.println(customer.getName() + " loves " + customer.getInterests().get(0));
    }
}
