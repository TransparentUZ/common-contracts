package uz.powercorp.common.dto.response;


import java.util.List;

public record TransactionHistoryResponseDTO(
        List<TransactionResponseToAgentDTO> sessions,
        Pagination pagination
) implements BaseResponse {
}
