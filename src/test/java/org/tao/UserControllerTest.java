package org.tao;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.tao.controller.GreetingController;

class UserControllerTest {

    private WebTestClient testClient;

    @BeforeAll
    void setUp() throws Exception {
        this.testClient = WebTestClient.bindToController(new GreetingController()).build();
    }
}
