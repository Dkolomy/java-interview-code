// How do you implement a binary search in Java?
public class ImplementingBinarySearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(binarySearch(arr, 0, arr.length - 1, 6));
    System.out.println(binarySearch(arr, 0, arr.length - 1, 10));
  }

  private static int binarySearch(int[] arr, int low, int high, int key) {
    int mid = (low + high) / 2;

    while (low <= high) {
      if (arr[mid] < key)
        low = mid + 1;
      else if (arr[mid] == key)
        return mid;
      else
        high = mid - 1;
      mid = (low + high) / 2;
    }

    if (low > high)
      return -1;
    return -1;
  }

}
