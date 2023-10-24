public class Factorial {

  public static void main(String[] args) {
    int n = 5;
    int factorial = 1;
    // rememeber take i =1 not 0 beacuse anything multiply by 0 is 0 so anwer will come 0
    int i = 1;
    while (i <= n) {
      factorial = factorial * i;
      i++;
    }
    System.out.println("Factorial of " + n + " is " + factorial);
  }
}
