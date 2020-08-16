package example.junit5.annotations.parameterized.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @Test
    void myFirstTest1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void myFirstTest2() {
        assertEquals(3, 2 + 1);
    }

    @Test
    void myFirstTest3() {
        assertEquals(5, 3 + 2);
    }

    @Test
    void myFirstTest4() {
        assertEquals(6, 3 + 3);
    }


    //если нужно 1 аргумент то можем оставить так
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    public void checkSumValueSource(int expected) {
        assertEquals(expected, 2);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void checkSumMethodSource(int expected, int actual) {
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(5, 4),
                Arguments.of(5, 5),
                Arguments.of(3, 1)
        );
    }

}

