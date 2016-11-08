package MediatorPattern;

import java.util.Date;

/**
 * Created by sethugayu on 8/15/16.
 */
public class ChatRoom {
    public static void  showMessage(User userString,String message){
        System.out.println(new Date().toString()+"["+ userString.getName()+"]:"+ message);
    }

}
