package com.example.classtest;

public class account {
    String name;
    int age;
    public static void main(String[] args){
        account a = new account();
        a.setName("Ezequiel");
        a.setAge(23);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.showDetails();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
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
