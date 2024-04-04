// How do you find the second largest number in an array in Java?
public class SecondHighest {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 6, 4, 8, 9, 5 };
    System.out.println(findSecondHighest(arr));
  }

  private static int findSecondHighest(int[] array) {
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;

    for (int i : array) {
      if (i > highest) {
        secondHighest = highest;
        highest = i;
      } else if (i > secondHighest) {
        secondHighest = i;
      }
    }

    return secondHighest;
  }

}
