package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("In BeforeAll....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("In AfterAll....");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach.....");
    }
}