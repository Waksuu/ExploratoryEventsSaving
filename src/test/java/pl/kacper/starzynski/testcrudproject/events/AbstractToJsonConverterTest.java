package pl.kacper.starzynski.testcrudproject.events;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AbstractToJsonConverterTest {

    @Test
    void convertToDatabaseColumn() {
        AbstractToJsonConverter<DomainEvent> converter = new EventConverter();
        ProductAdded event = new ProductAdded(UUID.randomUUID(), "product", BigDecimal.TEN);
        String json = converter.convertToDatabaseColumn(event);
        ProductAdded result = (ProductAdded)converter.convertToEntityAttribute(json);

        assertEquals(event, result);
    }
}