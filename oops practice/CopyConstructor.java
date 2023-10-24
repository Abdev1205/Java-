class Cricket {
  String batsmen;
  Integer run;
  String result;

  public void matchSummary() {
    System.out.println("Batsman: " + batsmen);
    System.out.println("Runs Scored: " + run);
    System.out.println("Result: " + result);
  }

  Cricket(Cricket c2) {
    this.batsmen = c2.batsmen;
    this.run = c2.run;
    this.result = c2.result;
  }

  Cricket() {}
}

public class CopyConstructor {

  public static void main(String[] args) {
    Cricket c1 = new Cricket();
    c1.batsmen = "Virat";
    c1.run = 100;
    c1.result = "India Won by 10 Wicket";
    Cricket c2 = new Cricket(c1);
    c2.matchSummary();
  }
}
