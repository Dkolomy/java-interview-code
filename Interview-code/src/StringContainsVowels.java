public class StringContainsVowels {
  public static void main(String[] args) {
    System.out.println(stringContainsVosels("Hello"));
    System.out.println(stringContainsVosels("TV"));
  }

  public static boolean stringContainsVosels(String input) {
    return input.toLowerCase().matches(".*[aeiou].*");
  }
}
