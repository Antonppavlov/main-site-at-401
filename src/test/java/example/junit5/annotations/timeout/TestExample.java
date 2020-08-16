package example.junit5.annotations.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TestExample {

    @Timeout(value = 2,unit = TimeUnit.SECONDS)
    @Test
    void myFirstTest() throws InterruptedException {
       sleep(1113000);
    }

}

