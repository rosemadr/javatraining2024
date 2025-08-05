package section2;

public class Student {

  String name; //instance variable

  // notes for Building Blocks section 7: Objects
  public Student() {
    //this is the constructor (like a method but with no return type)
    // it runs whenever you initialise the object e.g. new Student
    System.out.println("Student constructor!");

  }

  public void Student() {
    // if you only had this method, this would compile.
    // but this is only a method - not a constructor
    // don't write methods like this - not with the same name as your class and also lower case
  }
  // if you don't provide a constructor the compiler will make a no-argument constructor

  public static void main(String[] args) {
    Student s = new Student(); // creates object
    s.name = "Jame T. Kirk"; // set variable
    System.out.println(s.name); // get variable
  }
}
