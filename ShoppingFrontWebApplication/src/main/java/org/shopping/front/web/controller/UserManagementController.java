package org.shopping.front.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.shopping.front.web.model.User;
import org.shopping.front.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

    Logger logger = LogManager.getLogger(ArticulesController.class);
    @Autowired
    UserService userService;

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String registerUser(@RequestBody User user) throws Exception {
        logger.info("/registerUser called with user : {}", () -> user);
        return userService.registerUser(user);
    }

}
