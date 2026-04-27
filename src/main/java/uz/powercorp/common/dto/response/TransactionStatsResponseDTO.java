package uz.powercorp.common.dto.response;

import java.util.List;

public record TransactionStatsResponseDTO(
        long totalTransactions,
        long completedTransactions,
        long pendingTransactions,
        long expiredTransactions,
        List<PaidTransactionsStats> paidTransactionsStats,
        List<ExpiredTransactionsStats> expiredTransactionsStats
) {}