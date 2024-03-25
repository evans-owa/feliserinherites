package com.vanse.data;

public class Box {
    private double l;
    double h;
    double w;

    Box () {

//        super();  // object class call the constructor

        this.h = -1;
        this.l=-1;
        this.w = -1;
    }

//    cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box (double l, double w, double h) {
        this.l = l;
        this.h =h;
        this.w = w;
    }

    Box (Box old){  // same concept as the access of the by reference type only like the Box class
        this.l = old.h;
        this.w = old.w;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running the box");
    }

}
