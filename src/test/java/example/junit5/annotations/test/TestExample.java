package example.junit5.annotations.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}

