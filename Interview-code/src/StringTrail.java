// How do you remove leading and trailing spaces from a string in Java?
public class StringTrail {
  public static void main(String[] args) {
    String s = "  abc  def\t";
    s = s.strip();
    System.out.println(s);
  }
}
