package sk.balaz.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/logging")
public class LoggingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/hello")
    public Map<String, String> logging(@RequestParam(defaultValue = "World") String name) {
        LOGGER.info("Name {}", name);
        return Map.of("Greeting", "Hello" + name);
    }

}
