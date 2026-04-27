package uz.powercorp.common.data.enums;

public enum Messages {
    TRANSACTION_EVENT ("Transaction Event"),
    NOTIFICATION_EVENT ("Notification Event");
    private  String message;

    Messages(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
