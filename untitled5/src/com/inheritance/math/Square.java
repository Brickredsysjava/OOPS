package com.inheritance.math;

public class Square extends area{
    private  int side ;
      public int calculatearea(int side){
         return side*side;
      }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    //All args construct
    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }
}
