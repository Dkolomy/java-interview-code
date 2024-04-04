import java.util.ArrayList;
import java.util.List;

// How do you check if a list of integers contains only odd numbers in Java?
public class CheckOddIntegers {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(3);
    list.add(5);
    System.out.println(list);
    System.out.println(onlyOddNumbers1(list));
//    System.out.println(onlyOddNumbers2(list));
    System.out.println();
    
    list.remove(0);
    System.out.println(list);
    System.out.println(onlyOddNumbers1(list));
    // System.out.println(onlyOddNumbers2(list));

  }

  private static boolean onlyOddNumbers2(List<Integer> list) {
    return list
            .parallelStream() // parallel stream for faster processing
            .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
  }

  private static boolean onlyOddNumbers1(List<Integer> list) {
    for (Integer integer : list) {
      if(integer % 2 == 0) return false;
    }
    return true;
  }

}
