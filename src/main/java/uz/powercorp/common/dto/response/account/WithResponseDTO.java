package uz.powercorp.common.dto.response.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import uz.powercorp.common.data.enums.WithdrawStatus;
import uz.powercorp.common.dto.response.BaseResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record WithResponseDTO(Long id, String message, WithdrawStatus status, Long ownerID, String ownerUsername, Double amount) implements BaseResponse {
}
