package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface BaseResponse {
    @JsonProperty("timestamp")
    default long timestamp() {
        return System.currentTimeMillis();
    }
}