package info.jemsit.common.clients.property;

import info.jemsit.common.clients.FeignAuthInterceptor;
import info.jemsit.common.dto.request.product.property.AddPropertyImagesRequestDTO;
import info.jemsit.common.dto.response.product.propeprty.PropertyResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "product-service", path = "/api/product", configuration = FeignAuthInterceptor.class)
public interface ProductServiceClient {

    @PostMapping("/v1/property/create-draft")
    PropertyResponseDTO createDraftProperty();

    @PostMapping(value = "/v1/property/add/images")
    PropertyResponseDTO addPropertyImage(@RequestBody AddPropertyImagesRequestDTO request);
}
