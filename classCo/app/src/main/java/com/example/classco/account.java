package com.example.classco;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;
@JsonDeserialize(using = account.Deserializer.class)

public class account {
    public static class Deserializer extends JsonDeserializer<account> {
        @Override
        public account deserialize(JsonParser jp, DeserializationContext context) throws IOException {
            JsonNode node = jp.getCodec().readTree(jp);
            return new account(node);
        }
    }
    public static final String DEFAULT_NAME ="Ezequiel";
    private String name = DEFAULT_NAME;
    public static final int DEFAULT_AGE = 24;
    private int age = DEFAULT_AGE;

    public account(int age, String name){
        this.age = age;
        this.name = name;
    }
    public account(){
        this(DEFAULT_AGE, DEFAULT_NAME);
    }
    public account(JsonNode node){
        this.age = (Integer) (node.get("age")).numberValue();
        this.name = node.get("name").asText();
    }

    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
    public void setAge(int age){
        if(age < 123){
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Person can't be that old!");
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void showDetails(){
        System.out.println(getAge() + ", " + getName());
    }

}
