public class Break {

  public static void main(String[] args) {
    // break is used to stop the loop when certain condition fulfills
    int i = 0;
    while (i <= 5) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
      i++;
    }
  }
}
