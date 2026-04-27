package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.powercorp.common.data.enums.SessionStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionWebResponseDTO {
    private Long id;
    private UUID sessionID;
    private SessionStatus status;
    private String amount;
    private Long ruBankID;
    private Long agentDepositID;
    private String ruBankName;
    private Long ownerID;
    private String ownerName;
    private LocalDateTime createdAt;
}
