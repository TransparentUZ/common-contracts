package uz.powercorp.common.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpiredTransactionsStats(LocalDate date, long expiredCount, BigDecimal expiredSum) {
}
