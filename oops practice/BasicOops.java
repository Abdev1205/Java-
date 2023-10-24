class Cricket {
  String batsmen;
  Integer run;
  String result;

  public void matchSummary() {
    System.out.println("Batsman: " + batsmen);
    System.out.println("Runs Scored: " + run);
    System.out.println("Result: " + result);
  }
}

public class BasicOops {

  public static void main(String[] args) {
    //^ creating constructor
    //NOTE - class name and constructor name will be same and constructor do not return anything and it can only call 1 time in scope
    // we can create constructor in three ways
    /*
        #1 Non paramterized Conbstructor  
        #2 Parameterized Constructor
        #3 Copy Constructor
    */
    Cricket c1 = new Cricket();
    c1.batsmen = "Sachin";
    c1.run = 120;
    c1.result = "India Won by 10 Wickets";
    c1.matchSummary();
  }
}
