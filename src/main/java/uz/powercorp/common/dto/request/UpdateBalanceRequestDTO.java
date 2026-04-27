package uz.powercorp.common.dto.request;

public record UpdateBalanceRequestDTO(
        Long ownerID,
        String ownerUsername,
        Double amount,
        Double amountInRUB
) {
}