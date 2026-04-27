package uz.powercorp.common.dto.response.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CardDailyTransactionAmountsSumResponseDTO(
        String cardNumber,
        String phoneNumber,
        LocalDate date,
        BigDecimal sumAmount
) {
}
