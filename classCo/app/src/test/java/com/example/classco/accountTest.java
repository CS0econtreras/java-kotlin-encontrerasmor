package com.example.classco;

import junit.framework.TestCase;

import org.junit.Test;

public class accountTest extends TestCase {

    public void testTestSetName() {
    }
    @Test
    public void testSetAge() {
        account Account = new account();
        Account.setAge(23);
        assertEquals(23, Account.getAge());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetAgeFail() {
        account Account = new account();
        Account.setAge(124);
        assertEquals(124, Account.getAge());
    }

    public void testTestGetNameOk() {
        account Account = new account();
        Account.setName("Ezequiel");
        assertEquals("Ezequiel", Account.getName());
    }


    public void testGetAgeFail() {
        account Account = new account();
        Account.setName(null);
        assertEquals("Ezequiel", Account.getName());
    }

    public void testShowDetails() {
    }
}