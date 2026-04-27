package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;
import uz.powercorp.common.data.enums.Status;

import java.time.LocalDate;
import java.util.UUID;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record TransactionHistoryRequestDTO(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate from,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate to,
        Status status,
        String cardType,
        UUID sessionID,
        Integer page,
        Integer limit
) {
}
