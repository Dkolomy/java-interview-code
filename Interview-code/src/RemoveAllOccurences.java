// How do you remove all occurrences of a given character from an input string in Java?
public class RemoveAllOccurences {

  public static void main(String[] args) {
    String str1 = "abcdABCDabcdABCD";
    str1 = str1.replace("a", "");
    System.out.println(str1);
  }
}