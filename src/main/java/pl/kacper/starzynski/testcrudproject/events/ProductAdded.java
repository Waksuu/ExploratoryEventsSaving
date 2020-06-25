package pl.kacper.starzynski.testcrudproject.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@EqualsAndHashCode(callSuper = true)
public class ProductAdded extends DomainEvent {
    private final UUID productId;
    private final String name;
    private final BigDecimal price;

    @JsonCreator
    public ProductAdded(UUID productId, String name, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
