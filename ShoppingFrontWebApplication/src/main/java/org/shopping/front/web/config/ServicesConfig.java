package org.shopping.front.web.config;

import com.invertory.api.InvertoryControllerApi;
import com.user.management.api.UserControllerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Value("${thirdparty.invertory.url}")
    private String invertoryServiceUrl;
    @Value("${thirdparty.user-management.url}")
    private String userManagementUrl;

    @Bean
    public InvertoryControllerApi invertoryApi() {
        InvertoryControllerApi invertoryControllerApi = new InvertoryControllerApi();
        invertoryControllerApi.getApiClient().setBasePath(invertoryServiceUrl);
        return invertoryControllerApi;
    }
    @Bean
    public UserControllerApi userControllerApi() {
        UserControllerApi userControllerApi = new UserControllerApi();
        userControllerApi.getApiClient().setBasePath(userManagementUrl);
        return userControllerApi;
    }


}
