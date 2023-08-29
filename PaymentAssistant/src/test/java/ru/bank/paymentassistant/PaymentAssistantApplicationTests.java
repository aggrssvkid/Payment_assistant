package ru.bank.paymentassistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bank.paymentassistant.controller.PaymentAssistantController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PaymentAssistantApplicationTests {

    @Autowired
    private PaymentAssistantController paymentAssistantController;

    @Test
    void contextLoads() {
        assertThat(paymentAssistantController).isNotNull();
    }

}
