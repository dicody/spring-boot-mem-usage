package dicody.springbootmemusage.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = UuidController.class)
class UuidControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    void shouldReturnListOfUuids() {
        webClient.get()
                .uri("/uuids")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(UUID.class)
                .hasSize(100);
    }

    @Test
    void shouldReturnErrorDueToMissingValidation() {
        webClient.get()
                .uri("/uuids?limit=-1")
                .exchange()
                .expectStatus().is5xxServerError();
    }
}