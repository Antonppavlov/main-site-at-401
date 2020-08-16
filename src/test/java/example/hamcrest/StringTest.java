package example.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    String name1 = "Бармаглот";
    String name2 = "БаРмАгЛот";
    String name3 = "        Бармаглот      ";

    @Test
    void assertEquals() {
        //проверка через обычный assert

        Assertions.assertEquals(name1.toLowerCase(),name2.toLowerCase());
        Assertions.assertEquals(name1,name2);
    }


    @Test
    void equalToIgnoringCase() {
        //проверка через MatcherAssert equalToIgnoringCase
       MatcherAssert.assertThat(name1, Matchers.equalToIgnoringCase(name2));
    }


    @Test
    void equalToCompressingWhiteSpace() {
        //проверка через MatcherAssert equalToIgnoringCase
       MatcherAssert.assertThat(name3, Matchers.equalToCompressingWhiteSpace(name1));
    }


    @Test
    void containsString() {
        //проверка через MatcherAssert equalToIgnoringCase
       MatcherAssert.assertThat(name1, Matchers.containsString("лот"));
    }


    @Test
    void endsWith() {
        //проверка через MatcherAssert equalToIgnoringCase
       MatcherAssert.assertThat(name1, Matchers.endsWith("аглот"));
    }


}
