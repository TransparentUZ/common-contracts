package uz.powercorp.common.dto.response.account;


import uz.powercorp.common.dto.response.BaseResponse;

public record CheckBalanceResponseDTO(String balance) implements BaseResponse {
}
