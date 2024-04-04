// Can you prove that a String object in Java is immutable programmatically?
public class ImmutableString {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = s1;
    System.out.println(s1 == s2);

    s1 = "Python";
    System.out.println(s1 == s2);
    System.out.println(s2);
  }
}
