package pl.kacper.starzynski.testcrudproject.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@JsonSubTypes({
        @JsonSubTypes.Type(value = ProductAdded.class, name = "ProductAdded"),
        @JsonSubTypes.Type(value = ProductDeleted.class, name = "ProductDeleted"),
        @JsonSubTypes.Type(value = ProductUpdated.class, name = "ProductUpdated")
})
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class DomainEvent {
    private LocalDateTime timeStamp;

    protected DomainEvent() {
        this.timeStamp = LocalDateTime.now(ZoneOffset.UTC);
    }
}

