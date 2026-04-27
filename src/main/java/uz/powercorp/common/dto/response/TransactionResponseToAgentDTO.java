package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.powercorp.common.data.enums.Status;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record TransactionResponseToAgentDTO(
        Long id,
        @JsonProperty("session_id")
        UUID sessionID,
        Status status,
        @JsonProperty("card_type")
        String cardType,
        @JsonProperty("card_number")
        String cardNumber,
        @JsonProperty("card_holder")
        String cardHolder,
        String bank,
        @JsonProperty("amount_rub_in")
        Double amountRubIn,
        @JsonProperty("amount_uzs_in")
        Double amountUZSIn,
        @JsonProperty("amount_uzs_out")
        Double amountUZSOut,
        @JsonProperty("checkout_url")
        String checkoutURL,
        @JsonProperty("created_at")
        LocalDateTime createdAt,
        @JsonProperty("paid_at")
        LocalDateTime paidAt,
        String balance
) implements BaseResponse {


    public TransactionResponseToAgentDTO withAmountUZSOut(Double amountUZSOut) {
        return new TransactionResponseToAgentDTO(
                this.id,
                this.sessionID,
                this.status,
                this.cardType,
                this.cardNumber,
                this.cardHolder,
                this.bank,        // ✅ was: null
                this.amountRubIn,
                this.amountUZSIn,
                amountUZSOut,
                this.checkoutURL,
                this.createdAt,
                this.paidAt,
                this.balance
        );
    }
}
