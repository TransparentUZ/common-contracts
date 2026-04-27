package uz.powercorp.common.dto.request;

public record CardTransactionsCountsRequestDTO(String cardNumberLast4, String phoneNumber,  Integer successfulTransactions, Integer pendingTransactions) {
}
