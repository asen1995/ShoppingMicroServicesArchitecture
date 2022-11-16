package org.shopping.front.web.config;

import com.invertory.api.InvertoryControllerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Value("${thirdparty.invertory.url}")
    private String invertoryServiceUrl;

    @Bean
    public InvertoryControllerApi invertoryApi() {
        InvertoryControllerApi invertoryControllerApi = new InvertoryControllerApi();
        invertoryControllerApi.getApiClient().setBasePath(invertoryServiceUrl);
        return invertoryControllerApi;
    }
}
