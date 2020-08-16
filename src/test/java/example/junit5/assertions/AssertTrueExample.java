package example.junit5.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueExample {

    @Test
    void myFirstTest() {
        Assertions.assertTrue(2==3,"Числа не равны");
    }

}

