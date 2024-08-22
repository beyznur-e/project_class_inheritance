import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends UserManager {

    public InstructorManager(User user) {
        super(user);
    }

    public void add() {
        System.out.println(user.getFirstName() + "Eğitmen eklendi.");
    }

    @Override
    public void addLesson(User user) {
        List<String> less = new ArrayList<String>();
        less.add("mat101");
        less.add("fen101");
        System.out.println(less + " dersleri eklendi.");
    }
}