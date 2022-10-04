package bridge;

public abstract class Notification {
    protected IMsgSender msgSender;
    public Notification(IMsgSender sender) {
        this.msgSender = sender;
    }

    public abstract void notify(String message);
}
