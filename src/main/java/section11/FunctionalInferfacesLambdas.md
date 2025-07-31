## Functional Interfaces & lambdas

### Functional Interfaces
Functional interfaces are interfaces with **exactly one** abstract method
They can be annotated with `@FunctionalInterface`, this is not mandatory but will help
Java provides many pre-defined functional interfaces: `Supplier, Consumer, Predicate, Function`, etc.

See code in [Main](Main.java) and [Animal](Animal.java)

### Lambdas
You can do the same thing but with the syntax of lambda expressions

`Animal cat = () -> System.out.println("Meow!");`
Here the method parameters `()` are empty.
The implementation after the `->` can be a line or block of code.

Lambdas are really useful if you want to have multiple implementations of the *same* abstract method in a single class.
See [Main file for example](Main.java)

Allowed variations in lambda expressions
```java
//one parameter:
  n -> 2*n;
  (n) -> 2*n;
  (int n) -> 2*n
  n -> { return 2*n; };
  (n) -> { return 2*n; };
  (int n) -> { return 2*n; };
  
//more parameters:
   (a, b) -> a*b;
   (int a, int b) -> { return a*b; };
   (a, b) ->  { return a*b; };
   (int a, int b) -> a*b;
```

#### Other resources
- [lambda expression tips](https://www.baeldung.com/java-8-lambda-expressions-tips)
