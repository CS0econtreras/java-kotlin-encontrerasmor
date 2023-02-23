package com.example.classco;

import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;

import org.junit.Test;

public class accountTest2 extends TestCase {


    public void testMain() {
    }

    public void testTestSetName() {
    }

    public void testSetAge() {
    }

    public void testTestGetName() {
    }

    public void testGetAge() {
    }

    public void testShowDetails() {
    }

    account Account;
    @Test
    public void setUp(){
        Account = new account();
    }
    @Test
    public void main() {
    }

    @Test
    public void testSetName() {
        Account.setName("Ezequiel");
        assertEquals("Ezequiel", Account.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAge() {
        Account.setAge(124);
        assertEquals(124, Account.getName());
    }

    @Test
    public void testGetName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void showDetails() {
    }
    @Test
    public void fromJSON() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\n" +
                "    \"age\": 1,\n" +
                "    \"name\": \"Ezequiel\"\n" +
                "}";
        Account = mapper.readValue(json, account.class);
        assertEquals(23, Account.getAge());
        assertEquals("Ezequiel", Account.getName());
        }
    }
