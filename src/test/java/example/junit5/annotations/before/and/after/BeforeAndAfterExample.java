package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.*;

public class BeforeAndAfterExample extends BaseTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAndAfterExample: beforeAll");
    }

    @BeforeEach
    void setUp1() {
        System.out.println("BeforeAndAfterExample: setUp1");
    }

    @BeforeEach
    void setUp2() {
        System.out.println("BeforeAndAfterExample: setUp2");
    }

    @Test
    void test1() {
        System.out.println("BeforeAndAfterExample: test1");
    }

    @Test
    void test2() {
        System.out.println("BeforeAndAfterExample: test2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeAndAfterExample: tearDown");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("BeforeAndAfterExample: afterAll");
    }
}

