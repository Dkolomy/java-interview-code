// How can you find the factorial of an integer in Java?
public class GetFactorial {

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }

  private static long factorial(long n) {
    if (n == 1)
      return 1;
    else
      return (n * factorial(n - 1));
  }

}
