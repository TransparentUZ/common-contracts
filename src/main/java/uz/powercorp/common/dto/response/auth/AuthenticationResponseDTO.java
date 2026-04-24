package uz.powercorp.common.dto.response.auth;

import uz.powercorp.common.data.enums.Roles;

import java.util.List;

public record  AuthenticationResponseDTO (
        Long id,
        String username,
        String email,
        List<Roles> authorities,
        String token,
        String refreshToken,
        ProfileResponseDTO profile
) {
}
