package datatypes.com.company;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person();
//        System.out.println(p.getAge());
//        System.out.println(p.isMarried());
//        p.setAge(30);
//        System.out.println(p.getAge());

        Integer a = new Integer(10); //value required in this constructor
        Integer b = 10;

        System.out.println("min value of integer: " + a.MIN_VALUE);
        System.out.println("max value of integer: " + a.MAX_VALUE);

        int a1 = 10;
        int b1 = 10;

//        comparisons:

        System.out.println("a1 and b1 equal? " + (a1 ==b1));
        System.out.println("a and b equal? " + (a == b)); //due to heap refs the two values are not compared, rather mem locs

        System.out.println("a b equal? " + (a.intValue() == b.intValue()));
        System.out.println(a.equals(b));
        System.out.println("equal at class level? " + (a.compareTo(b)));

//
    }
}
