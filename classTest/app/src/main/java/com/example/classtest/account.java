package com.example.classtest;

public class account {
    private String name;
    private int age;
    account(int age, String name){
        this.age = age;
        this.name = name;
    }
    account(){
        this(23,"Ezequiel");
    }
    public static void main(String[] args){

        account a = new account();
        a.setName("Ezequiel");
        a.setAge(23);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.showDetails();
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
