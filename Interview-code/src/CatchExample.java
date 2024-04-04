import java.io.FileInputStream;
import java.io.FileNotFoundException;

// How do you illustrate a try catch example in Java?
public class CatchExample {

  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("test.txt");
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
