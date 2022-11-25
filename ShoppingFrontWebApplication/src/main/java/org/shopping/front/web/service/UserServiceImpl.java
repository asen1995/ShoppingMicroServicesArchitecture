package org.shopping.front.web.service;

import com.user.management.ApiException;
import com.user.management.api.UserControllerApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mapstruct.factory.Mappers;
import org.shopping.front.web.mapper.UserServiceMapper;
import org.shopping.front.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    UserControllerApi userControllerApi;

    UserServiceMapper userServiceMapper = Mappers.getMapper(UserServiceMapper.class);

    @Override
    public String registerUser(User user) {
        try {
            logger.info("Calling registerUser with user : {}", () -> user);
            final com.user.management.model.User user1 = userServiceMapper.toUserManagementModel(user);
            final String response = userControllerApi.registerUserUsingPOST(user1);
            logger.info("registerUser successful and response is : {}", () -> response);
            return response;
        } catch (ApiException e) {
            logger.error("User management service returned error : {}", () -> e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
