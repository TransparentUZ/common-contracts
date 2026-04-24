package uz.powercorp.common.dto.message;

import com.fasterxml.jackson.annotation.JsonTypeName;
import uz.powercorp.common.data.enums.RabbitMQMessages;

@JsonTypeName("MediaUploaded")
public class MediaUploaded extends RabbitMQMessage{
    public MediaUploaded(String userId, RabbitMQMessages message) {
        super(userId, message);
    }

    protected MediaUploaded() {}
}
