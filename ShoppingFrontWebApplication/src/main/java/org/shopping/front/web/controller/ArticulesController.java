package org.shopping.front.web.controller;

import org.shopping.front.web.model.Articule;
import org.shopping.front.web.service.ArticuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticulesController {


    @Autowired
    ArticuleService articuleService;

    @RequestMapping(value = "registerArticule", method = RequestMethod.POST)
    public String createInvertory(@RequestBody Articule articule) throws Exception {
        return articuleService.createArticule(articule);
    }

}
