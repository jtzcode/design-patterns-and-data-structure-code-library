package bridge;

public class SevereNotification extends Notification {
    public SevereNotification(IMsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
