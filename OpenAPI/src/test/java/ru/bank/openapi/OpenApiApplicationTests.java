package ru.bank.openapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bank.openapi.controllers.OpenAPIController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OpenApiApplicationTests {

    @Autowired
    private OpenAPIController openAPIController;

    @Test
    void contextLoads() {
        assertThat(openAPIController).isNotNull();
    }

}
