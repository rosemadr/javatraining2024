package basics.access.customer;

import java.util.ArrayList;

public class Variables {
    public static void  main(String[] args) {
        int age = 28;
        String name = "Madi";

        Address address = new Address("Baker Street", "32b" );
        Customer customer = new Customer(name, new ArrayList<>(), address);
        System.out.println(customer.getName() + "\n this is the age int: " + age);
        changeCustomer(customer);
        change(age);
        System.out.println(customer.getName() + "\n this is the age int: " + age);
    }

    public static void change(int i) {
        i = 5;
    }

    public static void changeCustomer(Customer c) {
        c.setName("new name");
    }

/*   Heap and Stack
    stack - primative types are stored on the stack
    for reference types - the memory location is stored on the stack and it points to a loc on the heap
 */
    // scope: vars only accessible within code blocks e.g. can't access var i down here
    // anything defined on class level is accessible throughout the class - but only static when other methods are static

}
