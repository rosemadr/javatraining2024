package datatypes.com.company;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getAge());
        System.out.println(p.isMarried());
        p.setAge(30);
        System.out.println(p.getAge());

    }
}
