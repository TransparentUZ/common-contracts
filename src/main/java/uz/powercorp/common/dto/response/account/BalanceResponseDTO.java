package uz.powercorp.common.dto.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.powercorp.common.dto.response.BaseResponse;

public record BalanceResponseDTO(
        @JsonProperty("balance_in_UZS") String balance,
        @JsonProperty("balance_in_RUB") String balanceInRUB
) implements BaseResponse {
}
