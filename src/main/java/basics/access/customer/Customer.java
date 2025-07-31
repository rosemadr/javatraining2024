package basics.access.customer;

import basics.access.Access;
import basics.access.*;

import java.util.List;

public class Customer {
//    can only have one public class per file *otherwise it will not compile!*; class file is always singular
    private int age;
    private String name;
    private List<String> interests;
    private Address address;
    // attributes
    // fields - hold info about the state of an object

    public Customer() {
        // constructor ( no return type)
    }

    public Customer(String name, List<String> interests, Address address) {
        this.name = name;
        this.interests = interests;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void returnItem(String item) {
        System.out.println("I would like to return " + item + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Access access = new Access() {};
//      Modifier modifier = new Modifier() {}; // this is not imported in the above import basics.access.*; because it is in a subpackage
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}

