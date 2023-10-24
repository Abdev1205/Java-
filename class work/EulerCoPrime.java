public class EulerCoPrime {

  static int find(int a, int b) {
    if (a == 0) {
      return b;
    }
    return find((b % a), a);
  }

  static int phi(int n) {
    int num = 1;
    for (int i = 2; i < n; i++) {
      if (find(i, n) == 1) num++;
    }
    return num;
  }

  public static void main(String[] args) {
    int n = 1000;
    System.out.println(phi(n));
  }
}
