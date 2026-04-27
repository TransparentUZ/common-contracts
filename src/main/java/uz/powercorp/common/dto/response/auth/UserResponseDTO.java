package uz.powercorp.common.dto.response.auth;



import uz.powercorp.common.data.enums.Role;
import uz.powercorp.common.dto.response.BaseResponse;

import java.util.List;

public record UserResponseDTO(
        Long id,
        String username,
        List<Role> authorities,
        String token
) implements BaseResponse {

}
