// How do you check whether a string is a palindrome in Java?
public class PalindromeString {

  public static void main(String[] args) {
    String a = "abba";
    String b = "rockport";

    System.out.println("a - isPalindrome: " + checkPalindromeString(a));
    System.out.println("b - isPalindrome: " + checkPalindromeString(b));

  }

  private static boolean checkPalindromeString(String input) {
    boolean result = true;
    int length = input.length();
    for(int i = 0; i < length/2; i++) {
      if(input.charAt(i) != input.charAt(length - i - 1)) {
        result = false;
        break;
      }
    }
    return result;
  }

  
}
