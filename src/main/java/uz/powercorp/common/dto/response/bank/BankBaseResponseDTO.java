package uz.powercorp.common.dto.response.bank;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BankBaseResponseDTO(Long id, @JsonProperty("name") String bankName) implements BankBase {
}
