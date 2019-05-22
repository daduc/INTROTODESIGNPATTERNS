package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {
    private MountainBike bikeInProgress;

    public MountainBikeBuilder(MountainBike bike) {
        this.bikeInProgress = bike;

    }
    public void buildWideTires(){
        System.out.println("Building Wide Tires");
    }
    public void buildHandleBars(){
        System.out.println("Building Handle Bar");
    }
    BikeInterface getBike(){
        return bikeInProgress;
    }
}

