package dicody.springbootmemusage.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@EnableAutoConfiguration
@SpringBootTest(classes = UuidController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UuidControllerTest {

    static final ParameterizedTypeReference<List<UUID>> typeReference;

    static {
        ResolvableType resolvableType = ResolvableType.forClassWithGenerics(List.class, UUID.class);
        typeReference = ParameterizedTypeReference.forType(resolvableType.getType());
    }

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnListOfUuids() {
        ResponseEntity<List<UUID>> response = restTemplate.exchange(RequestEntity.get("/uuids").build(), typeReference);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.hasBody());
        assertEquals(response.getBody().size(), 100);
    }
}