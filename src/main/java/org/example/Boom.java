package org.example;


import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Boom {
    @Test
    public void test_JUnit() {
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
    }
}