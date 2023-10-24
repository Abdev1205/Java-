import java.util.*;

public class Input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //^ nextLine() --> for taking string
    //^ nextInt() --> for taking Int
    //^ nextFLoat() --> for taking Float
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println("The sum is " + (num1 + num2));
  }
}
