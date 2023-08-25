package sk.makay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A5_FactorialTest {

    @Test
    public void iterativeFactorialTest(){
        assertEquals(120, A5_Factorial.iterativeFactorial(5));
    }

    @Test
    public void recursiveFactorialTest(){
        assertEquals(120, A5_Factorial.recursiveFactorial(5));
    }

}