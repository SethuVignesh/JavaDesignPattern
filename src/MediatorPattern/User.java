package MediatorPattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class User {
    private String name;

    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
