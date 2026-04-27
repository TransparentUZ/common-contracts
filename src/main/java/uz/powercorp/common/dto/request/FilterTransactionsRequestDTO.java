package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import uz.powercorp.common.data.enums.Status;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record FilterTransactionsRequestDTO(
        Long ID,
        Status status,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        Long ownerDepositID,
        Long ownerID,
        String cardType,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String cardNumber,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String cardNumberLast4,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String amountFrom,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String amountTo,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String phoneNumber,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAtFrom,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAtTo
) {
}
