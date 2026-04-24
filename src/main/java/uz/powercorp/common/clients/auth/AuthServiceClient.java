package uz.powercorp.common.clients.auth;

import uz.powercorp.common.clients.FeignAuthInterceptor;
import uz.powercorp.common.dto.request.auth.AuthenticationRequestDTO;
import uz.powercorp.common.dto.response.auth.AuthenticationResponseDTO;
import uz.powercorp.common.dto.response.auth.UserDetailsResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "auth-service", path = "/api/auth", configuration = FeignAuthInterceptor.class)
public interface AuthServiceClient {

    @GetMapping("/v1/details")
    UserDetailsResponseDTO getUserDetails();

    @PostMapping("/v1/authenticate/with-otp")
    AuthenticationResponseDTO authenticateWithOtp(AuthenticationRequestDTO request);
}
