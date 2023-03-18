package com.inheritance;

public class Car {
    public void  chasis(int x )
    {
        System.out.println("The chasis is " + x + "meter long ");
    }

    public void wheel(float x){
        System.out.println("The wheel is "+ x + "inch long");
    }

    public void horsePower(int x, String name ){
        System.out.println("The horsePowe of the"+ name +"is"+ x + "hp");
    }
}
