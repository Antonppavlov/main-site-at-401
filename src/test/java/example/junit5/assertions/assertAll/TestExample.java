package example.junit5.assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {

    @Test
    void myFirstTest() {
        String[] strings1 = {"123", "345"};
        String[] strings2 = {"123", "345"};


        Assertions.assertAll("Пользователя",
                () -> Assertions.assertEquals("Иван", "Петр"),
                () -> Assertions.assertArrayEquals(strings1, strings2),
                () -> Assertions.assertEquals(1, 3),
                () -> Assertions.assertEquals("Иван", "Иван")
        );
    }

}

