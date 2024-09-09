package org.tao;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

class UserControllerTest {

    private WebTestClient testClient;

    @BeforeAll
    void setUp() throws Exception {
        this.testClient = WebTestClient.bindToController(new GreetingController())
            .build();
    }

    @Test
    void register() throws Exception {
        JSONObject json = new JSONObject();
        json.put("firstName", "John");
        json.put("lastName", "Dose");
        json.put("email", "John.on.ca");
        json.put("password", "password");
        System.out.println(json.toString());
        this.testClient.get().uri("/register")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo(json.toString());
    }
}
