package dicody.springbootmemusage.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/uuids")
public class UuidController {
    @GetMapping
    private Flux<UUID> getUuids(@RequestParam(required = false, defaultValue = "100") int limit) {
        return Flux.fromStream(
                IntStream
                        .iterate(0, prev -> prev + 1)
                        .limit(limit)
                        .mapToObj(ignore -> UUID.randomUUID())
        );
    }
}
