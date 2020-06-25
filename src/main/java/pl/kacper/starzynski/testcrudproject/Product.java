package pl.kacper.starzynski.testcrudproject;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private BigDecimal price;
    private Integer availabilityCount;

    @ElementCollection
    private Set<String> colors;
}
