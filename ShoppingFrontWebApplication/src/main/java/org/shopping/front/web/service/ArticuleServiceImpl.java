package org.shopping.front.web.service;

import org.apache.http.HttpStatus;
import org.shopping.front.web.model.Articule;
import org.springframework.stereotype.Service;

@Service
public class ArticuleServiceImpl implements ArticuleService {
    @Override
    public String createArticule(Articule articule) {
        //TODO implement later
        return String.valueOf(HttpStatus.SC_OK);
    }
}
