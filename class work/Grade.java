public class Grade {

  public static void main(String[] args) {
    int mark1 = 98;
    int mark2 = 89;
    int mark3 = 93;
    int total = mark1 + mark2 + mark3;
    int average = total / 3;
    System.out.println("Abhay Mishra 21BCE11045");
    if (average > 40) {
      if (average > 90) {
        System.out.println("Passed with " + average + " percentage");
        System.out.println("Grade - S");
      } else if (average > 80 && average < 90) {
        System.out.println("Passed with " + average + " percentage");
        System.out.println("Grade - A");
      } else if (average > 70 && average < 80) {
        System.out.println("Passed with " + average + " percentage");
        System.out.println("Grade - B");
      } else if (average > 60 && average < 70) {
        System.out.println("Passed with " + average + " percentage");
        System.out.println("Grade - C");
      } else if (average > 50 && average < 60) {
        System.out.println("Passed with " + average + " percentage");
        System.out.println("Grade - D");
      }
    } else {
      System.out.println("Failed with " + average + " percentage");
      System.out.println("Grade - F");
    }
  }
}
