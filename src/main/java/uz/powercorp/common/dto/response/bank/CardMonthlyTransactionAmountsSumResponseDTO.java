package uz.powercorp.common.dto.response.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CardMonthlyTransactionAmountsSumResponseDTO(
        String cardNumber,
        String phoneNumber,
        LocalDate date,
        BigDecimal sumAmount
) {
}
