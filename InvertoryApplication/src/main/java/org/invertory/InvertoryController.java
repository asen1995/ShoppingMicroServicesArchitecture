package org.invertory;

import org.invertory.model.Invertory;
import org.invertory.service.InvertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvertoryController {

    @Autowired
    InvertoryService invertoryService;

    @RequestMapping(value = "createInvertory", method = RequestMethod.POST)
    public String createInvertory(@RequestBody Invertory invertory) throws Exception {
        return invertoryService.createInvertory(invertory);
    }


}
