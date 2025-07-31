import basics.access.customer.Customer;
import basics.access.customer.VIPCustomer;

import java.util.Arrays;

public class FirstJavaApp {
    public static void main(String[] args) {
/*
**main method**
* public - access modifier
* static - belongs to class not instance
* void - no return type
* String[] args - array of strings
* OTHER PERMISSIBLE WAYS TO WRITE MAIN METHOD:
* public static void main(String[] args) {}
* public static void main(String[] anyName) {}
* public static void main(String args[]) {}
* public static void main(String... args)
* public final static void main(String[] args)
* static public void main(String[] args)
 */

//methods start with lower case, classes with Upper
//        System.out.println("Hello " + args[0]);
// system.out.println only accepts 1 argument
// javac .\FirstJavaApp.java - compiles class - creates class file
// java FirstJavaApp - run compiled class
// java FirstJavaApp <arg> - run compiled class with arguments
        Customer customer = new VIPCustomer(); //can also write without import as customer.Customer (but not good practice)
        // a *reference* is a variable that points to an object - in the above case 'customer'
        // instantiating object^
        customer.setName("Madi");

        if (args.length > 0) {
            customer.setInterests(Arrays.asList("coding", args[0])); //using main args
        }
        else customer.setInterests(Arrays.asList("coding"));

        System.out.println(customer.getName() + " loves " + customer.getInterests().get(0) ); // + " and " + customer.getInterests().get(1));

    }
}
