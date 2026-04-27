package uz.powercorp.common.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ClientsDailyTransactionResponseDTO(LocalDateTime  date, BigDecimal sumAmount) {
}
