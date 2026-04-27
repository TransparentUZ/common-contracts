package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.powercorp.common.dto.response.auth.AuthResponseDTO;
import uz.powercorp.common.dto.response.auth.UserResponseDTO;

import java.util.List;

@FeignClient(name = "auth-service", path = "/auth", configuration = FeignAuthInterceptor.class)
public interface AuthClient {
    @GetMapping("/check-token")
    AuthResponseDTO checkToken();

    @GetMapping("/get-by-id/{id}")
    AuthResponseDTO getUserById(@PathVariable("id") long id);  // ✅

    @GetMapping("/{username}")
    AuthResponseDTO getUserByUsername(@PathVariable("username") String username);  // ✅

    @PostMapping("/get-all-agents-by-ids")
    List<UserResponseDTO> getAllAgentsByIds(List<Long> ids);
}
