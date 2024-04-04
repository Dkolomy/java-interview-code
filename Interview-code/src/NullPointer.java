// Write a Java program to show a NullPointerException.
public class NullPointer {

  public static void main(String[] args) {
    printString(null, 3);
  }

  private static void printString(String s, int count) {
    // if (s == null) return;
    for (int i = 0; i < count; i++) {
      System.out.println(s.toUpperCase());
    }
  }
}
