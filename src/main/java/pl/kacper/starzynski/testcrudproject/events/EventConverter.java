package pl.kacper.starzynski.testcrudproject.events;


public class EventConverter extends AbstractToJsonConverter<DomainEvent> {

    @Override
    protected Class<DomainEvent> getTypeReference() {
        return DomainEvent.class;
    }
}