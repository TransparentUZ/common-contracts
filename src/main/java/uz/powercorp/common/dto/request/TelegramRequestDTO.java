package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record TelegramRequestDTO(
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String phone,
        String code,
        String password
) {
}
