
import java.util.Date;  
  
class Chat {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message);
    }
}
 class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   

    public void sendMessage(String message) {
        Chat.showMessage(this, message);
    }
}

public class MediatorPattern {
    public static void main(String[] args) {
        User A = new User("A");
        User B = new User("B");
        
        A.sendMessage("Hi B! How are you?");
        B.sendMessage("I'm great! Thanks for asking. How are you?");
    }
}