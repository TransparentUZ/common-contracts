package uz.powercorp.common.dto.request.auth;

import uz.powercorp.common.annotations.ValidPassword;
import jakarta.validation.constraints.Email;

public record RegisterRequestDTO(
        String username,
        @ValidPassword
        String password,
        @Email(message = "Email should be valid")
        String email,
        String agencyName,
        String licenseNumber
) {
}
