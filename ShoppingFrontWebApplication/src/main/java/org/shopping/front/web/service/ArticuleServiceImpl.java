package org.shopping.front.web.service;

import com.invertory.ApiException;
import com.invertory.api.InvertoryControllerApi;
import com.invertory.model.Invertory;
import org.shopping.front.web.model.Articule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuleServiceImpl implements ArticuleService {

    @Autowired
    InvertoryControllerApi invertoryControllerApi;

    @Override
    public String createArticule(Articule articule) {

        try {
            final String invertoryUsingPOST = invertoryControllerApi.createInvertoryUsingPOST(new Invertory());

            return invertoryUsingPOST;
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
