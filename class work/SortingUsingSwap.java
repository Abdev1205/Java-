public class SortingUsingSwap {

  public static void main(String[] args) {
    String s = "Hell-world";
    char[] arr = s.toCharArray();
    int n = s.length();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == '-' || arr[j] == '-') {
          continue;
        }
        if (arr[i] > arr[j]) {
          //swap the characters
          char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Sorted string: " + new String(arr));
  }
}
