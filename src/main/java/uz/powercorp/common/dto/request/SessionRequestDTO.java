package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.powercorp.common.annotations.validation.MoneyFormat;

public record SessionRequestDTO(
        @MoneyFormat(message = "Amount must contain only digits, spaces and '.'")
        String amount,
        @JsonProperty("ru_bank_id")
        Long ruBankID,
        @JsonProperty("agent_deposit_id")
        Long agentDepositID
) {
}
