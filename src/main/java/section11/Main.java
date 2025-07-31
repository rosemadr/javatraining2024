package section11;

public class Main {

  public static void main(String[] args) {
//    Dog dog = new Dog();
//    dog.speak();

    // functional interface
    Animal dog = new Animal() {
      // have implemented the abstract method speak without defining a class which implementing animal
//      @Override
      public void speak() {
        System.out.println("Woof!");
      }
    };
    //lambda
    Animal cat = () -> System.out.println("Meow!");
    Animal cow = () -> System.out.println("Moo!");

    dog.speak();
    cat.speak();
    cow.speak();


  }
}