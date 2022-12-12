package org.shopping.front.web.service;

import com.invertory.ApiException;
import com.invertory.api.InvertoryControllerApi;
import com.invertory.model.Invertory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mapstruct.factory.Mappers;
import org.shopping.front.web.mapper.InvertoryServiceMapper;
import org.shopping.front.web.model.Articule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuleServiceImpl implements ArticuleService {

    Logger logger = LogManager.getLogger(ArticuleServiceImpl.class);

    @Autowired
    InvertoryControllerApi invertoryControllerApi;


    InvertoryServiceMapper invertoryServiceMapper = Mappers.getMapper(InvertoryServiceMapper.class);

    @Override
    public String createArticule(Articule articule) {
        try {

            final Invertory invertory = invertoryServiceMapper.toInvertoryModel(articule);

            logger.info("Calling createInvertory with invertory : {}", () -> invertory);
            final String invertoryUsingPOSTResponse = invertoryControllerApi.createInvertoryUsingPOST(invertory);
            logger.info("createInvertory succesfull and response is : {}", () -> invertoryUsingPOSTResponse);

            return invertoryUsingPOSTResponse;
        } catch (ApiException e) {
            logger.error("Invertory service returned error : {}", () -> e.getResponseBody());
            throw new RuntimeException(e.getResponseBody());
        }
    }
}
