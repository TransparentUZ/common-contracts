package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "transaction-service",  configuration = FeignAuthInterceptor.class)
public interface TransactionClient {

    @PostMapping("/check-session-is-possible/{bankID}/{amount}")
    boolean checkSessionIsPossible(@PathVariable("bankID") Long bankID, @PathVariable("amount") String amount);
}
