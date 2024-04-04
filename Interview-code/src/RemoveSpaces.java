// How do you remove spaces from a string in Java?
public class RemoveSpaces {

  public static void main(String[] args) {
    String a = "Please     Help      Me !!!";
    System.out.println(removeWhiteSpaces(a));  
  }

  private static String removeWhiteSpaces(String input) {
    StringBuffer output = new StringBuffer();

    char[] charArray = input.toCharArray();
    for (char c : charArray) {
      if(!Character.isWhitespace(c)) output.append(c);
    }

    return output.toString();
  }


}
