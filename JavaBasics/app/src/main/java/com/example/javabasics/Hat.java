package com.example.javabasics;

public class Hat implements AutoCloseable{
    //Primitive types in java
    private boolean isOld; //True or False
    private byte age;// -128 .. 127
    private short threadCount; // -32768 .. 32767
    private int priceInCents; // -2 billion .. + 2 billion
    private long taxId; // -2^63-1
    private float size; // base 2 representation (about 7 decimal digits mantessa ) x 10^(p/m 30)
    private double distToCenterOfUniverseInAngstroms; // like float 15 digits pm 300

    private char x; // shows number between 0 .. 65535 (part of a UTF-16 multichar encoding in a string)

    String name;

    Hat(float size, String name){
        this.size = size;
        this.name = name;
    }
    Hat(float size){
        this(size, "hat");
    }
    Hat(){
        this(10.0f, "hat");
    }
    public void close(){
        System.out.println("closing har " + this + "named" + name);
    }

    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getThreadCount() throws IllegalAccessException {
        if (threadCount > 0) {
            this.threadCount = threadCount;
        } else {
            throw new IllegalArgumentException("thread must be positive");
        }

        return threadCount;
    }

    public void setThreadCount(short threadCount) {
        this.threadCount = threadCount;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public long getTaxId() {
        return taxId;
    }

    public void setTaxId(long taxId) {
        this.taxId = taxId;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public double getDistToCenterOfUniverseInAngstroms() {
        return distToCenterOfUniverseInAngstroms;
    }

    public void setDistToCenterOfUniverseInAngstroms(double distToCenterOfUniverseInAngstroms) {
        this.distToCenterOfUniverseInAngstroms = distToCenterOfUniverseInAngstroms;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
