package uz.powercorp.common.dto.request.bank;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record TransactionCountsRequestDTO(String cardNumberLast4, String phoneNumber,  Integer successfulTransactions, Integer pendingTransactions) {
}
