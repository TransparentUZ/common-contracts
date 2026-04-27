package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.powercorp.common.dto.request.UpdateBalanceRequestDTO;
import uz.powercorp.common.dto.response.account.CheckBalanceResponseDTO;

@FeignClient(name = "account-service", path = "/account", configuration = FeignAuthInterceptor.class)
public interface AccountClient {

    @PostMapping("/update-balance/{agentID}")
    CheckBalanceResponseDTO updateBalance(@PathVariable("agentID") Long agentID, UpdateBalanceRequestDTO request   );

    @GetMapping("/check-balance/{agentID}")
    CheckBalanceResponseDTO checkBalanceWithAgentID(@PathVariable("agentID") Long agentID);
}
