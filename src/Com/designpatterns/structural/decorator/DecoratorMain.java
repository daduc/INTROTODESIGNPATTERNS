package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.base.NarrowWheel;
import Com.designpatterns.base.Touring;

public class DecoratorMain {
    public static void main(String[] args){
        BikeInterface myTourBike = new Touring(new NarrowWheel(24));
        System.out.println(myTourBike);
        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
        myTourBike = new CustomGripsOption(myTourBike);
        System.out.println(myTourBike);
    }
}
