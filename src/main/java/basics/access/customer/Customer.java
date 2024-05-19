package basics.access.customer;

import java.util.List;

public class Customer {
//    can only have one public class per file; class file is always singular
    private int age;
    private String name;
    private List<String> interests;
    private Address address;
    // attributes

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
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}

