package uz.powercorp.common.dto.response.bank;


import uz.powercorp.common.dto.response.BaseResponse;

import java.util.List;

public record AllBanksResponseDTO(List<? extends BankBase> banks) implements BaseResponse {
}
