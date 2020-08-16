package example.junit5.assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {

    @Test
    void myFirstTest() {
        Assertions.fail("Я в любом случае падаю! за что???");
    }

}

