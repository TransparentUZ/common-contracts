package uz.powercorp.common.dto.request.bank;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import uz.powercorp.common.data.enums.SystemCard;

public record CardRequestDTO(
        Long id,
        String uzBank,
        SystemCard system,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String cardNumber,
        String cardHolderName,
        @JsonDeserialize(using = SpaceRemoverDeserializer.class)
        String phoneNumber,
        CardTypeRequestDTO cardType,
        Long bindToAgent,
        boolean included,
        boolean blocked
) {
}
