package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TgPhoneNumberResponseDTO(
        String phoneNumber,
        String status,
        @JsonProperty("port")
        String url
) {
}
