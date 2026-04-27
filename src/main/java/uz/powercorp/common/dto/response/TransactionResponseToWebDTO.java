package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.powercorp.common.data.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record TransactionResponseToWebDTO(
        long id,
        @JsonProperty("agentDepositID")
        Long ownerDepositID,
        UUID sessionID,
        long ownerID,
        String ownerUsername,
        Status status,
        String cardNumber,
        String cardHolder,
        String cardType,
        String phoneNumber,
        BigDecimal amount,
        boolean completed,
        boolean manuallyEdited,
        @JsonProperty("amount_rub_in")
        BigDecimal amountRubIn,
        @JsonProperty("amount_uzs_in")
        BigDecimal amountUZSIn,
        @JsonProperty("amount_uzs_out")
        BigDecimal amountUZSOut,
        @JsonProperty("created_at")
        LocalDateTime createdAt,
        @JsonProperty("paid_at")
        LocalDateTime paidAt
        ) implements BaseResponse {
}
