package uz.powercorp.common.dto.request.account;

public record UpdateBalanceRequestDTO(
        Long ownerID,
        String ownerUsername,
        Double amount,
        Double amountInRUB
) {
}
