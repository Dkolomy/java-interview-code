// Write a Java program to print a Fibonacci sequence using recursion.
// F(N) = F(N-1) + F(N-2)
public class PrintFibonacciRecursive {
  public static void main(String[] args) {
    int seqLength = 10;
    System.out.println("A Fibonacci sequence of " + seqLength + " numbers. ");
    for (int i = 0; i < seqLength; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }

  private static int fibonacci(int count) {
    if (count <= 1)
      return count;
    return fibonacci(count - 1) + fibonacci(count - 2);
  }

}
