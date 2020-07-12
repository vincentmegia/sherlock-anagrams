package com.vincentmegia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() throws UnsupportedEncodingException {
        var app = new App();
        var result = app.process("kkkk");
        assertTrue(result == 10);
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        var app = new App();
        var result = app.process("abba");
        assertTrue(result == 4);
        result = app.process("abcd");
        assertTrue(result == 0);
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        var app = new App();
        var result = app.process("cdcd");
        assertTrue(result == 5);
    }
}
