package uz.powercorp.common.dto.response.auth;

import uz.powercorp.common.data.enums.Roles;

import java.util.List;

public record UserDetailsResponseDTO(
        Long id,
        String username,
        String email,
        List<Roles> roles,
        ProfileResponseDTO profile
) {
}
