package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uz.powercorp.common.dto.request.TelegramRequestDTO;

import java.util.Map;

@FeignClient(name = "tg-listener-service")
public interface TgListenerClient {
    @PostMapping("add_user")
    String addTelegramUser(@RequestBody TelegramRequestDTO request);

    @PostMapping("confirm_code")
    String confirmCode(@RequestBody TelegramRequestDTO request);

    @GetMapping("pulse")
    Map<String, String> pulse();

    @PostMapping("delete_user")
    String deleteTelegramUser(@RequestBody TelegramRequestDTO request);
}
