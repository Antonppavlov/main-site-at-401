package example.junit5.assertions.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);

        assertEquals("123", "123");


        Object o1 = new Object();
        Object o2 = o1;

        assertEquals(o1, o2);
    }

}

