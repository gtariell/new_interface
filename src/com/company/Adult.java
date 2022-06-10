package com.company;

public class Adult implements Human{

    @Override
    public void move() {
        System.out.println("Move");
    }

    @Override
    public void talk() {
        System.out.println("Talk");
    }

    public static void main(String[] args) {
        Adult anAdult = new Adult();
        anAdult.talk();
        anAdult.move();
        Human aHuman = (Human) anAdult;
        aHuman.talk();

    }

}
