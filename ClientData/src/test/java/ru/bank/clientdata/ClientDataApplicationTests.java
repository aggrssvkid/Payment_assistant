package ru.bank.clientdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bank.clientdata.controllers.ClientDataController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ClientDataApplicationTests {

    @Autowired
    private ClientDataController clientDataController;

    @Test
    void contextLoads() {
        assertThat(clientDataController).isNotNull();
    }

}
