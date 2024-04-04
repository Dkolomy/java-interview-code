import java.util.Scanner;

// Can you create a pyramid of characters in Java?
// https://www.digitalocean.com/community/tutorials/pyramid-pattern-programs-in-java
public class PyramidPattern {

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Please enter the row to print:");
    // int rows = scanner.nextInt();
    int rows = 9;
    System.out.println("Rows=" + rows);
    // scanner.close();

    System.out.println("Pinting Pattern\n");
    printPattern1(rows);
    printPattern2(rows);

  }

  private static void printPattern1(int rows) {
    for (int i = 1; i <= rows; i++) {
      int numberOfWhiteSpaces = rows - i;
      printString(" ", numberOfWhiteSpaces);
      printString(i + " ", i);
      System.out.println("");
    }
  }

  private static void printString(String s, int times) {
    for (int j = 0; j < times; j++) {
      System.out.print(s);
    }
  }

  private static void printPattern2(int rows) {
    for (int i = 1; i <= rows; i++) {
      int numberOfWhiteSpaces = rows - i;
      printString(" ", numberOfWhiteSpaces);
      for (int x = 1; x <= i; x++) {
        System.out.print(x + " ");
      }
      System.out.println("");
    }
  }

}
