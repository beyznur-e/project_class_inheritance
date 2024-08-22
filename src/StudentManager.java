import java.util.ArrayList;
import java.util.List;

public class StudentManager extends UserManager {
    public StudentManager(User user) {
        super(user);
    }

    public void add() {
        System.out.println(user.getFirstName() + "Öğrenci eklendi.");
    }

    public void addLesson(User user) {
        List<String> less = new ArrayList<String>();
        less.add("mat100");
        less.add("fen100");
        System.out.println(less + " derslerine kayıt olundu..");
    }
}
