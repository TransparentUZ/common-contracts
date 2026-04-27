package uz.powercorp.common.dto.response.bank;

import java.time.LocalDateTime;

public record CardsMaxTransactionCountResponseDTO (Long id, Integer maxTransactionCount, LocalDateTime createdAt) {
}
