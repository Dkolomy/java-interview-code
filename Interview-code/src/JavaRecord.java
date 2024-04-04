import java.util.Map;

// How do you create a record in Java?
public class JavaRecord {

  public record EmpRecord(int id, String name, long salary, Map<String, String> addresses) {}
}
