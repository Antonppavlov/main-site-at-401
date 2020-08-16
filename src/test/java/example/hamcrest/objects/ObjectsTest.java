package example.hamcrest.objects;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ObjectsTest {

    @Test
    void sameInstance() {
        Dog spoke = new Dog("Споук");
        Dog spokeLink = spoke;

        MatcherAssert.assertThat(spoke, Matchers.sameInstance(spokeLink));
    }


    @Test
    void hasToString() {
        Dog spoke = new Dog("Споук");
        System.out.println(spoke.toString());
        MatcherAssert.assertThat(spoke, Matchers.hasToString("Dog{name='Споук'}"));
    }

    @Test
    void typeCompatibleWith() {
//        Dog spoke = new Dog("Споук");
        MatcherAssert.assertThat(Dog.class, Matchers.typeCompatibleWith(Animals.class));
    }

    @Test
    void instanceOf() {
        Dog spoke = new Dog("Споук");
        MatcherAssert.assertThat(spoke, Matchers.instanceOf(Animals.class));
    }

    @Test
    void hasProperty() {
        Dog spoke = new Dog("Споук");
        MatcherAssert.assertThat(spoke, Matchers.hasProperty("name", Matchers.equalTo("Споук")));
    }

    @Test
    void samePropertyValuesAs() {
        Dog spoke1 = new Dog("Споук");
        Dog spoke2 = new Dog("Споук");


//        MatcherAssert.assertThat(spoke1,  Matchers.equalTo(spoke2));
        MatcherAssert.assertThat(spoke1, Matchers.samePropertyValuesAs(spoke2));
    }
}
