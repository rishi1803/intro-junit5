package guru.springframework;

import org.junit.jupiter.api.*;

/**
 * Created by Rishabh on 05,Jan,2020
 */
public class GreatingTest {

    private Greating greating;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before- I am only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each ....");
        greating = new Greating();
    }

    @Test
    void helloWorld() {
        System.out.println(greating.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greating.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After each ....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After!!!*** - I am only called Once!!!");
    }
}
