## Predicate
Predicate is a pre-defined functional interface provided by Java.
`import java.util.function` package
One abstract method, `test(T)`, it takes an argument of type `T` and returns `boolean`

e.g.
```java
import java.util.function.predicate;
import java.lang.Integer;
public class MyClass {
  public static void man(String[] args) {
    Predicate<Integer> gt10 = n -> n > 10;
    System.out.println(gt10.test(7));
    System.out.println(gt10.test(12));
  }
}
```

### Other resources
[Medium article What is the predicate in Java?](https://medium.com/@JavaFusion/what-is-the-predicate-in-java-a7b67ed1884a)
[Java docs for predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)