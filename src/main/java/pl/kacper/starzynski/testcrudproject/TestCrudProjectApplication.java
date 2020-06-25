package pl.kacper.starzynski.testcrudproject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestCrudProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestCrudProjectApplication.class, args);
    }
}
