package pl.kacper.starzynski.testcrudproject.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class ProductUpdated extends DomainEvent {
    private final UUID productId;
    private final String name;
}
