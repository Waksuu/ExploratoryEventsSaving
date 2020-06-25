package pl.kacper.starzynski.testcrudproject;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @ExceptionLogger(messageTemplate = "This is my exception msg")
    public void doStuff(String myParam) {
        throw new RuntimeException();
    }
}
