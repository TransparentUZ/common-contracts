package uz.powercorp.common.dto.request.bank;

public record CardTransactionsCountsRequestDTO(String cardNumberLast4, String phoneNumber,  Integer successfulTransactions, Integer pendingTransactions) {
}
