package uz.powercorp.common.dto.request.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import uz.powercorp.common.data.enums.AgentType;

public record UserRequestDTO(
        String username,
        String email,
        String password,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        AgentType agentType,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        Double agentCommission,
        String agentCallBackUrl,
        boolean addWebAgentRole
) {
}
