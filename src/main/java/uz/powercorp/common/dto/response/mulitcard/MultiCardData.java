package uz.powercorp.common.dto.response.mulitcard;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MultiCardData(
        String id,
        @JsonProperty("store_id")
        String storeId,
        String uuid,
        @JsonProperty("payment_amount")
        String paymentAmount,
        @JsonProperty("total_amount")
        String totalAmount,
        @JsonProperty("commission_amount")
        String commissionAmount,
        String status,
        @JsonProperty("checkout_url")
        String checkoutUrl
) {
}
 