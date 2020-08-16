package example.junit5.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullExample {

    @Test
    void assertNotNull() {
        String name = "Кот";
        Assertions.assertNotNull(name);
    }

    @Test
    void myFirstTest() {
        String name = null;
        Assertions.assertNull(name);
    }

}

