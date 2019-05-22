package Com.designpatterns;

import Com.designpatterns.base.NarrowWheel;
import Com.designpatterns.base.RoadBike;
import Com.designpatterns.base.Touring;

public class Main {
    public static void main(String[] args) {
        //use Abstract parent object with child constructor
        RoadBike bike = new Touring(new NarrowWheel(22));
        System.out.println(bike.getColor());
    }
}
