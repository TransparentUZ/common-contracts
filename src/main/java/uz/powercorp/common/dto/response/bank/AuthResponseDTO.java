package uz.powercorp.common.dto.response.bank;


import uz.powercorp.common.dto.response.BaseResponse;

public record AuthResponseDTO(
        Long id,
        String username,
        Double agentCommission,
        String agentCallBackUrl,
        String token
) implements BaseResponse {}
