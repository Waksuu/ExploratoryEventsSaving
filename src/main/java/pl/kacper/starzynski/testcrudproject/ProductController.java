package pl.kacper.starzynski.testcrudproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.kacper.starzynski.testcrudproject.events.EventLog;
import pl.kacper.starzynski.testcrudproject.events.EventLogRepository;
import pl.kacper.starzynski.testcrudproject.events.ProductAdded;
import pl.kacper.starzynski.testcrudproject.events.ProductDeleted;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductRepository productRepository;
    private final EventLogRepository eventLogRepository;
    private final ProductService productService;

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @GetMapping("/test")
    public void testLogger() {
        productService.doStuff("test");
    }

    @GetMapping("/test-event")
    public List<EventLog> testEvent() {
        ProductDeleted event = new ProductDeleted(20);
        EventLog record = new EventLog(event);
        eventLogRepository.save(record);
        return eventLogRepository.findAll();
    }
}
