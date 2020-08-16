package example.junit5.assertions.array.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestExample {

    @Test
    void myFirstTest() {
        String[] strings1 = {"123", "345"};
        String[] strings2 = {"123", "345"};

        assertArrayEquals(strings1, strings2);
    }

}

