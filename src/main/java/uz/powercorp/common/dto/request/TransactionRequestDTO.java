package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import uz.powercorp.common.data.enums.Status;

@Getter
@Setter
public class TransactionRequestDTO {

    private Status status;
    private String amount;
    @JsonProperty("amount_uzs_in")
    private String amountUZS;

}
