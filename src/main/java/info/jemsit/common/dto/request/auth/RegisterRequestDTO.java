package info.jemsit.common.dto.request.auth;

import info.jemsit.common.annotations.ValidPassword;
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
