package example.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    void name() {

        //Проверка что актуальное больше ожидаемого
        MatcherAssert.assertThat(100, Matchers.greaterThan(90));

        //Проверка что актуальное больше или равно ожидаемому
        MatcherAssert.assertThat(100, Matchers.greaterThanOrEqualTo(100));


        //Проверка что актуальное меньше или равно ожидаемому
        MatcherAssert.assertThat(90, Matchers.lessThanOrEqualTo(100));

        //Проверка с погрешностью
        MatcherAssert.assertThat(101.00, Matchers.closeTo(100, 10));
    }
}
