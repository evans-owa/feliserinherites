package com.vanse.data;

import java.sql.SQLOutput;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) { // access by type of reference type concept cover for the entire
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // call the parent class constructor
        // use to initialize parent class constructor

//        System.out.println(super.w); // can be used in place of the "this" keyword

        this.weight = weight;
    }
}
