package uz.powercorp.common.dto.response.bank;

import uz.powercorp.common.dto.response.BaseResponse;

import java.util.Set;

public record BankResponseDTO (Long id, String bankName, String webClientInstructionText, Set<CardTypeResponseDTO> cardTypes, Set<CardResponseDTO> cards) implements BankBase, BaseResponse {
}
