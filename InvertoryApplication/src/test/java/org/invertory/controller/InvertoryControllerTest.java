package org.invertory.controller;

import org.invertory.model.Invertory;
import org.invertory.service.InvertoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.properties")
public class InvertoryControllerTest {

    @Autowired
    InvertoryService invertoryService;

    @Test
    void createInvertory() {
        final String createInvertoryStatus = invertoryService.createInvertory(new Invertory());
        assertEquals("200", createInvertoryStatus);

    }
}
