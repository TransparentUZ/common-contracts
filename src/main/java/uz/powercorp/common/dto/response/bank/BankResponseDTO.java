package uz.powercorp.common.dto.response.bank;

import java.util.Set;

public record BankResponseDTO(long id, String bankName, Set<CardTypeResponseDTO> cardTypes)  {
}
