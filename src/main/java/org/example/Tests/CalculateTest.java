package org.example.Tests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    @Test
    public void test1(){
        assertEquals(4,Calculate.sum(2,2));

    }
    @Test
    public void test2(){
        assertEquals(16,Calculate.multi(8,2));

    }
    @Test
    public void test3(){
        assertEquals(0,Calculate.minus(2,2));

    }
    @Test
    public void test4(){
        assertEquals(4,Calculate.devide(40,10));

    }

}
