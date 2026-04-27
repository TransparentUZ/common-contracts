package uz.powercorp.common.dto.response.mulitcard;

public record MultiCardResponseDTO(
        Boolean success,
        MultiCardData data
) {
}
