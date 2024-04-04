// How do you reverse a string in Java?
public class StringPrograms {

  public static void main(String[] args) {
    String str = "123";
    System.out.println(reverse(str));
  }

  private static String reverse(String in) {
    if (in == null)
      throw new IllegalAccessError("Null is not valid input");

    StringBuffer out = new StringBuffer();
    char[] chars = in.toCharArray();

    for (int i = chars.length - 1; i >= 0; i--) {
      out.append(chars[i]);
    }

    return out.toString();
  }

}
