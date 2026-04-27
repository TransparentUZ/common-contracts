package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.powercorp.common.data.enums.SessionStatus;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record SessionResponseDTO(
        @JsonProperty("session_id")
        UUID sessionID,
        SessionStatus status,
        String amount,
        @JsonProperty("ru_bank_id")
        Long ruBankID,
        @JsonProperty("agent_deposit_id")
        Long agentDepositID
) implements BaseResponse {
}
