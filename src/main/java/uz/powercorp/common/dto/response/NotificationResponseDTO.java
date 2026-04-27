package uz.powercorp.common.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record NotificationResponseDTO(
        Long id,
        String cardNumber,
        String phoneNumber,
        BigDecimal amount,
        LocalDateTime sentAt,
        Boolean hasMatch,
        Boolean isManual,
        LocalDateTime createdAt
) {
}
