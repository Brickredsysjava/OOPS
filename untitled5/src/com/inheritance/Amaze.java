package com.inheritance;

public class Amaze extends HondaCar{
    public void  chasis(int x )
    {
        System.out.println("The chasis is must" + x + "meter long ");
    }

    public void wheel(float x){
        System.out.println("The wheel size should be"+ x + "inch long");
    }

    public void horsePower(int x, String name ){
        System.out.println("The horsePower of the car should "+ name +" is "+ x + " hp ");
    }
    public static void main(String[] args) {
        Amaze a = new Amaze();
        a.chasis(3);
        a.wheel(18);
        a.horsePower(83, "Amaze");
    }
}
