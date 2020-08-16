package example.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class AllOffTest {


    @Test
    void allOf() {
        double actual = 100.00;
        double expected = 99.00;

        MatcherAssert.assertThat(
                actual,
                Matchers.allOf(
                        Matchers.greaterThan(expected),
                        Matchers.lessThanOrEqualTo(101.00),
                        Matchers.closeTo(expected, 1.00)
                )
        );
    }

    @Test
    void anyOf() {
        double actual = 100.00;
        double expected = 90.00;

        MatcherAssert.assertThat(
                actual,
                Matchers.anyOf(
                        //успешная
                        Matchers.greaterThan(expected),
                        //успешная
                        Matchers.lessThanOrEqualTo(101.00),
                        //не успешная, но так как anyOf и проходит хотя бы одна другая то ок
                        Matchers.equalTo(expected)
                )
        );
    }

    @Test
    void equalTo() {
        double actual = 100.00;
        double expected = 90.00;

        MatcherAssert.assertThat(
                actual,
                Matchers.equalTo(expected)
        );
    }

    @Test
    void not() {
        double actual = 100.00;
        double expected = 90.00;

        MatcherAssert.assertThat(
                actual,
                Matchers.not(
                        Matchers.equalTo(expected)
                )
        );
    }

}
