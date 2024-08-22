import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public User user;

    public UserManager(User user) {
        this.user = user;
    }

    public void add(User user) {
        System.out.println(user.getFirstName() + " Eklendi.");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " Silindi.");
    }

    public void update(User user) {
        System.out.println(user.getFirstName() + " Güncellendi.");
    }

    public void addLesson(User user) {
        List<String> less = new ArrayList<String>();
        System.out.println(" Eklendi.");
    }

}
