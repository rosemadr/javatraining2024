package section11;

import java.util.function.Predicate;

public class MyPredicateWorkspace {
  static void myProbe (int n, Predicate<Integer> predicate) {
    if (predicate.test(n)) {
      System.out.println("test has passed");
    } else {
      System.out.println("test has failed");
    }
  }

  public static void main(String[] args) {
    myProbe(5, n -> n > 2);
    myProbe(5, n -> n % 2 == 0);

    Predicate<Integer> myCriterium = n -> n*n + 5 > 100;
    myProbe(5, myCriterium);
    //pass implementation as variable in method
  }
}
