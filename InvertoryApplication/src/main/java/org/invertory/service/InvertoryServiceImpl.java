package org.invertory.service;

import org.apache.http.HttpStatus;
import org.invertory.model.Invertory;
import org.springframework.stereotype.Service;

@Service
public class InvertoryServiceImpl implements InvertoryService {
    @Override
    public String createInvertory(Invertory invertory) {
        //TODO implement later
        return String.valueOf(HttpStatus.SC_OK);
    }
}
