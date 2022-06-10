package com.company;

public abstract class Person implements Human {
    protected int age = 0;
    protected String firstname = "firstname";
    protected String lastname = "lastname";
    protected String gender = Human.GENDER_MALE;
    protected int progress = 0;
    public void move() {
        this.progress++;
    }
}
