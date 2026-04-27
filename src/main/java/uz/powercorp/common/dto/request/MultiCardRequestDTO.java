package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MultiCardRequestDTO(
        String amount,
        @JsonProperty("payment_system")
        String paymentSystem,
        @JsonProperty("store_id")
        String storeId
) {
}
