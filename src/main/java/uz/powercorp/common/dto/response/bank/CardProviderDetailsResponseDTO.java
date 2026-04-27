package uz.powercorp.common.dto.response.bank;

import java.math.BigDecimal;

public record CardProviderDetailsResponseDTO(String cardProviderName, BigDecimal totalAmount) {
}
