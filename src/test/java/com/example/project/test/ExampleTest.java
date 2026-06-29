package com.example.project.test;

import com.example.project.Example;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    public ExampleTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 2;
        int y = 3;
        Example instance = new Example();
        int expResult = 5;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }

}
