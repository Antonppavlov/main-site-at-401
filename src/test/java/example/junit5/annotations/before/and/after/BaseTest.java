package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void beforeAllBaseTest() {
        System.out.println("BaseTest: beforeAll");
    }

    @BeforeEach
    void setUpBaseTest() {
        System.out.println("BaseTest: setUp1");
    }


    @AfterAll
    static void afterAllBaseTest() {
        System.out.println("BaseTest: afterAll");
    }
}
