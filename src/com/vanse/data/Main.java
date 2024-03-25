package com.vanse.data;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box3 = new Box(45.5);
//        Box box2 = new Box(4.6,34,22);
//        System.out.println(box1.l + " "+ box1.h + " "+ " " + box1.w);
//        System.out.println(box3.h + " " + box3.w );
//        Box box4 = new Box(box2);

//        BoxWeight box10 = new BoxWeight();
//        BoxWeight box11 = new BoxWeight();
//        System.out.println(box11.h + " " + box11.weight );


        Box box = new BoxWeight(6,4,3,23);
        System.out.println(box.h);
        //super key word makes it possible
//        System.out.println(box.weight);
        //not possible because the type reference determines which variable to accessed that are public
        // access the public declared ones



        //there are many variables in both parent and child classes
        //you are given access to variables  that are in the REf type i,e Boxweight
        //hence, you should have access to weight variables
        //this also mean that ones you are to access should be initialised
        ///but there, when obj itself is of type parent class, how will you call the constructor
        // this is why the error

//            BoxWeight box23 = new Box(6,4,3);
//            System.out.println(box.h);
            BoxPrice boxPrice = new BoxPrice(5,5,6,36,100);
        System.out.println(boxPrice.price);

    }
}
