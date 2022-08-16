package dicody.springbootmemusage.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/uuids")
public class UuidController {
    @GetMapping
    private List<UUID> getUuids(@RequestParam(required = false, defaultValue = "100") int limit) {
        return IntStream
                .iterate(0, prev -> prev + 1)
                .limit(limit)
                .mapToObj(ignore -> UUID.randomUUID())
                .collect(Collectors.toList());
    }
}
