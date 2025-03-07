package test.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPrime {
    static main.java.Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new main.java.Exercises();
    }
    @Test
    void testPrime0() {
        assertTrue(ex.isPrime(1));
    }
    @Test
    void testPrime1() {
        assertTrue(ex.isPrime(41));
    }

    @Test
    void testPrime2() {
        assertTrue(ex.isPrime(2455));
    }

    @Test
    void testPrime3() {
        assertTrue(ex.isPrime(2147483647));
    }
}
