package uz.powercorp.common.dto.message;

import com.fasterxml.jackson.annotation.JsonTypeName;
import uz.powercorp.common.data.enums.RabbitMQMessages;

@JsonTypeName("MediaFromMobileStarted")
public class MediaFromMobileStarted extends RabbitMQMessage {

    public MediaFromMobileStarted(String userId, RabbitMQMessages message) {
        super(userId, message);
    }

    protected MediaFromMobileStarted() {}
}
