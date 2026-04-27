package uz.powercorp.common.clients;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import uz.powercorp.common.UserContext;

@Component
public class FeignAuthInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String token = UserContext.getUserToken();
        if (token != null && !token.isEmpty()) {
            requestTemplate.header("Authorization", token);
        }
    }
}
