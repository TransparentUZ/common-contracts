package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AgentCallBackRequestDTO {

    @JsonProperty("session_id")
    private String sessionId;
    private String status;
    @JsonProperty("amount_rub_in")
    private BigDecimal amountRubIn;
    @JsonProperty("amount_uzs_in")
    private BigDecimal amountUzsIn;
    @JsonProperty("amount_rub_out")
    private BigDecimal amountRubOut;
    @JsonProperty("amount_uzs_out")
    private BigDecimal amountUzsOut;
    private String timestamp;
}
