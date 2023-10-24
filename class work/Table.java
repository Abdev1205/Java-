public class Table {

  public static void main(String[] args) {
    int i = 1;
    while (i <= 15) {
      if (i == 4) {
        i++;
        continue;
      }
      System.out.println(i + " X 2 = " + i * 2);
      i++;
    }
  }
}
