package uz.powercorp.common.dto.request.notification;

import com.fasterxml.jackson.annotation.JsonProperty;

public record NotificationRequestDTO(@JsonProperty("card_number") String  cardNumber, @JsonProperty("phone_number") String phoneNumber, @JsonProperty("date") String sentAt, String amount) implements Notification {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
