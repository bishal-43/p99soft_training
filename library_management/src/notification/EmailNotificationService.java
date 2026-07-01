package notification;

import java.awt.*;

// NotificationService is open for extension but will not be modified

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendNotification(String message, String email){
        System.out.println("email sent to " + email);
        System.out.println(message);
    }
}
