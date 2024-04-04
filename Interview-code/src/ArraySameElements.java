// Write Java program that checks if two arrays contain the same elements.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

  public static void main(String[] args) {
    Integer[] a1 = { 1, 2, 3, 2, 1 };
    Integer[] a2 = { 1, 2, 3 };
    Integer[] a3 = { 1, 2, 3, 4 };

    System.out.println(sameElements(a1, a2));
    System.out.println(sameElements(a1, a3));
  }

  private static boolean sameElements(Integer[] array1, Integer[] array2) {
    Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
    Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));

    if (uniqueElements1.size() != uniqueElements2.size())
      return false;

    for (Object obj : uniqueElements1) {
      if (!uniqueElements2.contains(obj))
        return false;
    }

    return true;
  }

}
