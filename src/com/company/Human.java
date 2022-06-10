package com.company;

public interface Human {
    final String GENDER_MALE = "MALE";
    final String GENDER_FEMALE = "FEMALE";
    default void move(){}
    void talk();
}