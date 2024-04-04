import java.util.Arrays;
import java.util.Random;

// How do you shuffle an array in Java?
public class ShuffleArray {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Random rand = new Random();

    for (int i = 0; i < array.length; i++) {
      int randomIndex = rand.nextInt(array.length);
      int temp = array[randomIndex];
      array[randomIndex] = array[i];
      array[i] = temp;
    }

    System.out.println(Arrays.toString(array));

  }
}
