class Cricket {
  String batsmen;
  Integer run;
  String result;

  Cricket() {
    System.out.println("Constructor Called");
  }

  public void matchSummary() {
    System.out.println("Batsman: " + batsmen);
    System.out.println("Runs Scored: " + run);
    System.out.println("Result: " + result);
  }
}

public class NonParameterized {

  public static void main(String[] args) {
    Cricket c1 = new Cricket();
    c1.batsmen = "Sachin";
    c1.run = 120;
    c1.result = "India Won by 1 Wickets";
    c1.matchSummary();
  }
}
