package function;

import java.util.*;

public class SumOfTwoNumber {

  public static int calculateSum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans = calculateSum(a, b);
      System.out.println(ans);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
