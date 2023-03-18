package com.inheritance.math;

import static java.lang.System.*;

public class Demo {
    public static void main(String[] args) {

        Square s = new Square(10 );
        int a=s.calculatearea(s.getSide() );
        s.print(a);
        Square s1=new Square();
        s1.setSide(5);
        s1.print(s1.calculatearea(s1.getSide()));
        area a1 =new area();
        Circle c1=new Circle();
//        out.println(a1 instanceof area);
//        out.println("++++++++++++++");
//        out.println(s instanceof Square);
//        out.println("++++++++++++");
//        out.println(c1 instanceof  area);
//        Demo d1=new Demo();
//        out.println(d1 instanceof Demo);
        out.println("++++++++++++");
//        out.println(d1 instanceof Circle);


    }
}
