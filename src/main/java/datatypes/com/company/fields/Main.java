package datatypes.com.company.fields;

import datatypes.com.company.fields.Field;

public class Main {
    public static void main(String[] args) {

        Field f = new Field("test", 30);
//        f.setName("test field");
//        f.setAge(19);

        System.out.println(f.getAge() + " " + f.getName());

    }
}
