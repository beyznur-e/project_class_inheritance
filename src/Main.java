import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        instructor.setFirstName("Beyza");
        instructor.setLastName("Ertem");
        instructor.setInstructorNo("1234b");
        instructor.setCity("Ankara");

        Student student = new Student();
        student.setFirstName("Fatih");
        student.setLastName("Ertem");
        student.setStudentNo("1234f");
        student.setCity("Ankara");

        UserManager userManager = new UserManager(instructor);
        userManager.add(instructor);
        userManager.add(student);

        InstructorManager instructorManager = new InstructorManager(instructor);
        instructorManager.addLesson(instructor);

        StudentManager studentManager = new StudentManager(student);
        studentManager.addLesson(student);

    }
}