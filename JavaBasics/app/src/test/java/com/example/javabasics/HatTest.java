package com.example.javabasics;

import static org.junit.Assert.*;

import org.junit.Test;

public class HatTest {

    @Test
    public void close() {
    }

    @Test
    public void isOldDefault() {
        Hat hat = new Hat();
        assertFalse(hat.isOld());

    }

    @Test
    public void setOldGetSet() {
        Hat hat = new Hat();
        hat.setOld(true);
        assertTrue(hat.isOld());
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getThreadCount() {
        Hat hat = new Hat();
        assertEquals(0, hat.getThreadCount());
    }

    @Test
    public void getThreadCountSet() {
        Hat hat = new Hat();
        hat.setThreadCount((short) -33);
        hat
    }

    @Test
    public void getPriceInCents() {
    }

    @Test
    public void setPriceInCents() {
    }

    @Test
    public void getTaxId() {
    }

    @Test
    public void setTaxId() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void setSize() {
    }

    @Test
    public void getDistToCenterOfUniverseInAngstroms() {
    }

    @Test
    public void setDistToCenterOfUniverseInAngstroms() {
    }

    @Test
    public void getX() {
    }

    @Test
    public void setX() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }
}