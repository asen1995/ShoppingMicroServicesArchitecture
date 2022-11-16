package org.shopping.front.web.service;

import com.invertory.ApiException;
import com.invertory.api.InvertoryControllerApi;
import com.invertory.model.Invertory;
import org.mapstruct.factory.Mappers;
import org.shopping.front.web.mapper.InvertoryServiceMapper;
import org.shopping.front.web.model.Articule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuleServiceImpl implements ArticuleService {

    @Autowired
    InvertoryControllerApi invertoryControllerApi;


    InvertoryServiceMapper invertoryServiceMapper = Mappers.getMapper(InvertoryServiceMapper.class);

    @Override
    public String createArticule(Articule articule) {

        try {

            final Invertory invertory = invertoryServiceMapper.toInvertoryModel(articule);
            final String invertoryUsingPOST = invertoryControllerApi.createInvertoryUsingPOST(invertory);

            return invertoryUsingPOST;
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
