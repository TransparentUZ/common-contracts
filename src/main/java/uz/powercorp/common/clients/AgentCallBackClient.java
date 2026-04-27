package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import uz.powercorp.common.dto.request.AgentCallBackRequestDTO;

import java.net.URI;

@FeignClient(name = "agent-callback-client", url = "placeholder")
public interface AgentCallBackClient {
    @PostMapping
    String sendCallBack(URI uri, AgentCallBackRequestDTO payload);
}
