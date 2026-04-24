package info.jemsit.common.dto.response.auth;

import info.jemsit.common.data.enums.Roles;

import java.util.List;

public record UserDetailsResponseDTO(
        Long id,
        String username,
        String email,
        List<Roles> roles,
        ProfileResponseDTO profile
) {
}
