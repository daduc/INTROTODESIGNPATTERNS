package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder {
    private RoadBike bikeInProgress;
    public RoadBikeBuilder(RoadBike bike){
        this.bikeInProgress = bike;
    }
    BikeInterface getBike(){
        return bikeInProgress;
    }
    public void buildStreetTires(){
        System.out.println("Building Street Tire");
    }
    public void buildHandleBars(){
        System.out.println("Building Handle Bars");
    }
}
