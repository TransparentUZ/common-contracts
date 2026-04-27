package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uz.powercorp.common.dto.request.MultiCardRequestDTO;
import uz.powercorp.common.dto.response.mulitcard.MultiCardResponseDTO;

@FeignClient(
        name = "multicard-client",
        url = "https://mesh.multicard.uz"
)
public interface MultiCardClient {
    @PostMapping("/tips/payment/agr")
    MultiCardResponseDTO getSbpResponse(@RequestBody MultiCardRequestDTO request);
}
