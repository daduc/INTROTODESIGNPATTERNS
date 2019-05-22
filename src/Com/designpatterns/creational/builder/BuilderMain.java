package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.base.NarrowWheel;
import Com.designpatterns.base.RoadBike;
import Com.designpatterns.base.Touring;

public class BuilderMain {
    public static void main(String[] args) {
        RoadBike bike = new Touring(new NarrowWheel(22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);
    }
}
