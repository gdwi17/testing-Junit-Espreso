package com.example.testing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void function_tambah() {
        assertEquals(10, new MainActivity().function_tambah(5,5));
    }

    @Test
    public void kurang() {
        assertEquals(10, new MainActivity().kurang(15,5));
    }

    @Test
    public void kali() {
        assertEquals(5, new MainActivity().kali(1,5));
    }

    @Test
    public void bagi() {
        assertEquals(2, new MainActivity().bagi(10,5));
    }

}