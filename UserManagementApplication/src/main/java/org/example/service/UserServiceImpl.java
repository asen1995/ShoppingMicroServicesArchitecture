package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String registerUser(User user) {
        return "success";
    }
}
