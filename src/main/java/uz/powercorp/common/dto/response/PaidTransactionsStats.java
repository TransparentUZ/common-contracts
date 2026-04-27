package uz.powercorp.common.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PaidTransactionsStats(LocalDate date, long paidCount, BigDecimal paidSum) {
}
