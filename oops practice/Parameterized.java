class Cricket {
  String batsmen;
  Integer run;
  String result;

  public void matchSummary() {
    System.out.println("Batsman: " + batsmen);
    System.out.println("Runs Scored: " + run);
    System.out.println("Result: " + result);
  }

  Cricket(String batsmen, Integer run, String result) {
    this.batsmen = batsmen;
    this.run = run;
    this.result = result;
  }
}

public class Parameterized {

  public static void main(String[] args) {
    // parameterized constructor
    Cricket c1 = new Cricket(
      "Sachin",
      120, // Pass an integer literal instead of using Integer.valueOf
      "India Won by 10 wickets"
    );
    c1.matchSummary();
  }
}
