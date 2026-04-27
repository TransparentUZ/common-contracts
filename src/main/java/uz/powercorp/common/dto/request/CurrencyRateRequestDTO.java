package uz.powercorp.common.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CurrencyRateRequestDTO(@JsonProperty("currency_rate") Double rubToUzsRate) {
}
