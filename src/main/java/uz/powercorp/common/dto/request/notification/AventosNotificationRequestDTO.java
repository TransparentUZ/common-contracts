package uz.powercorp.common.dto.request.notification;

import java.time.LocalDateTime;

public record AventosNotificationRequestDTO(String id, String invoice, String amount, LocalDateTime date, String status) implements Notification {

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getPhoneNumber() {
        return null;
    }
}
