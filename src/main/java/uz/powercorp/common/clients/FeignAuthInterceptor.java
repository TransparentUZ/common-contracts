package uz.powercorp.common.clients;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import uz.powercorp.common.UserContext;
import org.springframework.stereotype.Component;

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
