package uz.powercorp.common.dto.response.bank;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import uz.powercorp.common.data.enums.SystemCard;
import uz.powercorp.common.dto.request.SpaceRemoverDeserializer;
import uz.powercorp.common.dto.response.BaseResponse;

import java.time.LocalDateTime;

public record CardResponseDTO(
        long id,
        String uzBank,
        String phoneNumber,
        String cardHolderName,
        CardTypeResponseDTO cardType,
        boolean included,
        SystemCard system,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String cardNumber,
        Long bindToAgent,
        boolean blocked,
        boolean held,
        LocalDateTime heldAt,
        @JsonProperty("notifications")
        Integer Last24HoursSuccessfulTransactionsCount,
        @JsonProperty("pending")
        Integer Last24HoursPendingTransactionsCount
) implements BaseResponse {
}
