import java.util.List;

public class Instructor extends User {

    String instructorNo;
    List<String> insLesson;

    public String getInstructorNo() {
        return instructorNo;
    }

    public void setInstructorNo(String instructorNo) {
        this.instructorNo = instructorNo;
    }

    public List<String> getInsLesson() {
        return insLesson;
    }

    public void setInsLesson(List<String> insLesson) {
        this.insLesson = insLesson;
    }
}
