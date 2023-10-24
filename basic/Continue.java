public class Continue {

  public static void main(String[] args) {
    // continue is used for escapaing that value
    // in hindi usko chode ke age chale jayo
    int x = 0;
    while (x < 10) {
      if (x == 4) {
        x++;
        continue;
      }
      System.out.println(x);
      x++;
    }
  }
}
