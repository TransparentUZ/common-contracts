package uz.powercorp.common.dto.response.bank;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import uz.powercorp.common.data.enums.SystemCard;
import uz.powercorp.common.dto.request.SpaceRemoverDeserializer;
import uz.powercorp.common.dto.response.BaseResponse;

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
        boolean held
) implements BaseResponse {
}
