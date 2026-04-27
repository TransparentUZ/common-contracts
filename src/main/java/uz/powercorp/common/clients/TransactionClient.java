package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.powercorp.common.dto.response.TgPhoneNumberResponseDTO;

import java.util.List;

@FeignClient(name = "transaction-service",  configuration = FeignAuthInterceptor.class)
public interface TransactionClient {

    @PostMapping("/check-session-is-possible/{bankID}/{amount}")
    boolean checkSessionIsPossible(@PathVariable("bankID") Long bankID, @PathVariable("amount") String amount);


    @GetMapping("tg-listener/pulse")
    List<TgPhoneNumberResponseDTO> getAllTgPhoneNumbers();

    @GetMapping("/get-by-card-number-last4-and-phone-number")
    Long getAgentDepositIdByCardNumberLast4AndPhoneNumber(@RequestParam String cardNumberLast4Digits, @RequestParam String phoneNumber);
}
