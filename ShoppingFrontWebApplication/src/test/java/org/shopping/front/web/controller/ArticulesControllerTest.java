package org.shopping.front.web.controller;

import org.junit.jupiter.api.Test;
import org.shopping.front.web.model.Articule;
import org.shopping.front.web.service.ArticuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.properties")
public class ArticulesControllerTest {

    @Autowired
    ArticuleService articuleService;

    @Test
    void createInvertory() {
        final String createInvertoryStatus = articuleService.createArticule(new Articule());
        assertEquals("200", createInvertoryStatus);

    }
}
