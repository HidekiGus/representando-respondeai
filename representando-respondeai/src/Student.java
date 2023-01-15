import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<String> subjects = new ArrayList<String>();

  public ArrayList<String> getSubjects() {
    return this.subjects;
  }

  public void addSubject(Subject subjectName) {
    this.subjects.add(subjectName.toString());
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
