public class StrobeFunction {

  /* -------------------------------------------------------------------------- */
  /*                        // ! what is strobe function                        */
  /* -------------------------------------------------------------------------- */

  //NOTE -

  // ^strobe function is used to check whether given no is same or not when we rotate that number 180 degree
  // & strobe no are 0,1,6,9 so we will use this no to check whether given no is strobe number or not

  /* -------------------------------------------------------------------------- */
  /*                          // ? strobe function                              */
  /* -------------------------------------------------------------------------- */

  static boolean strobe(String n) {
    int left = 0;
    int right = n.length() - 1;

    while (left <= right) {
      char c = n.charAt(left);
      char d = n.charAt(right);

      if (
        (c == '0' && d == '0') ||
        (c == '1' && d == '1') ||
        (c == '6' && d == '9') ||
        (c == '9' && d == '6')
      ) {
        left++;
        right--;
      } else {
        return false;
      }
    }

    return true;
  }

  /* -------------------------------------------------------------------------- */
  /*                           // ? Java Main function                          */
  /* -------------------------------------------------------------------------- */

  public static void main(String[] args) {
    String number = "6969"; // Example number to test

    if (strobe(number)) {
      System.out.println("//The number is a strobe number.");
    } else {
      System.out.println("//The number is not a strobe number.");
    }
  }
}
