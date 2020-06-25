package pl.kacper.starzynski.testcrudproject.events;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class EventLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Convert(converter = EventConverter.class)
    @Column(columnDefinition = "TEXT")
    private DomainEvent event;

    public EventLog(DomainEvent event) {
        this.event = event;
    }
}
