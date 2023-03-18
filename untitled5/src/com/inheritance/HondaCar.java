package com.inheritance;

public class HondaCar extends Car {


    public void chasis(int x){
        System.out.println("The car chasis should be always more than"+ x+ "meter long");
    }
    public static void main(String[] args) {
        HondaCar h  = new HondaCar();
        h.chasis(4);
        h.wheel(22.3f);
        h.horsePower(83, "honda");
    }
}
