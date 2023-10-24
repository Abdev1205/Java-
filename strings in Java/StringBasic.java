public class StringBasic {

  public static void main(String[] args) {
    String str1 = "BHOPAL";
    String str2 = "Bhopal VIT";

    // lenght() function gives no of char present in string
    System.out.println(str1.length());

    // equals() funcation gives boolean value whether two string are case senstive equal or not
    if (str1.equals(str2)) {
      System.out.println("Str1 and str2 are equal");
    } else {
      System.out.println("Str1 and str2 are not equal");
    }

    // equalsIgnoreCase() funcation givec boolean value whether two string are equal or not without checking case senstive
    if (str1.equalsIgnoreCase(str2)) {
      System.out.println("Str1 and str2 are equal");
    } else {
      System.out.println("Str1 and str2 are not equal");
    }
    // toLowerCase() function make all the character of the string lowercase
    String lowerCase = str1.toLowerCase();
    System.out.println(lowerCase);

    // toUpperCase function make all the character of string Uppercase
    String upperCase = str1.toUpperCase();
    System.out.println(upperCase);

    // endsWith()  give boolean value after taking argument and check whether that string ends with that character or not (suffix)
    if (str1.endsWith("L")) {
      System.out.println("String ends with L");
    } else {
      System.out.println("String do not ends with L");
    }

    // startsWith() give boolean value after taking argument and check whether that string starts with that charcter or not (prefix)
    if (str1.startsWith("B")) {
      System.out.println("String starts with B");
    } else {
      System.out.println("String do not starts with B");
    }
    String result = str1.concat(" ").concat("India");

    // str1.concat("India");
    System.out.println(result);
  }
}
