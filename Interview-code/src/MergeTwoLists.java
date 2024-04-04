import java.util.ArrayList;
import java.util.List;

// How do you merge two lists in Java?
public class MergeTwoLists {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("1");
    List<String> list2 = new ArrayList<>();
    list2.add("2");

    List<String> mergeList = new ArrayList<>(list1);
    mergeList.addAll(list2);
    System.out.println(mergeList);
  }
}
