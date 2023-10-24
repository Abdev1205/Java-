class Cricket {
  String batsmen;
  Integer run;
  String result;

  public void matchSummary(String batsmen) {
    System.out.println("Batsman: " + batsmen);
  }

  public void matchSummary(Integer run) {
    System.out.println("Runs Scored: " + run);
  }
}

public class Polymorphosis {

  public static void main(String[] args) {
    //^ we have to type of polymorphosis
    /*

     * Function Overloading -> Function overloading is a concept in polymorphism where a class can have multiple methods with the same name, but they differ in the number or type of their parameters. This allows you to create methods with the same name that perform different operations based on the arguments they receive.

     * Function overriding -> Function overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass (or parent class). The overriding method in the subclass has the same name, return type, and parameters as the method in the superclass. 

     */
    Cricket c1 = new Cricket();
    c1.matchSummary("Abhay");
    c1.matchSummary(150);
  }
}
