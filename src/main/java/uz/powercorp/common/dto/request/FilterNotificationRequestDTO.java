package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

public record FilterNotificationRequestDTO(
        Long ID,
        String cardNumber,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String phoneNumber,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String amountFrom,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String amountTo,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAtFrom,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAtTo
) {
}
