package section2;

public class Dog {
  private String name = "Puppy";

  public Dog() {
    name = "Harley";
    System.out.println("Inside the constructor...");
  }

  { System.out.println("Outside the initialiser block..."); }

  public static void main(String[] args) {
    Dog d = new Dog();
    System.out.println(d.name);
  }

}

  /*
  order of initialisation
  - code between two brackets { ... } is called code block
  - instance initialiser - code block outside method
  - order of initialisation:
    1. fields and instance initialiser blocks in the order in which they appear
    2. constructor runs at the end
   */
