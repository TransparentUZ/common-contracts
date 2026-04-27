package uz.powercorp.common.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pagination(
        int page,
        int limit,
        @JsonProperty("total_count")
        long totalCount,
        @JsonProperty("total_pages")
        long totalPages
) {
}
