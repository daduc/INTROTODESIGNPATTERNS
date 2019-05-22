package Com.designpatterns.structural.facade;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.creational.singleton.SerialNumberGenerator;

public class Registration {
    private BikeInterface bike;

    Registration(BikeInterface bike) {
        this.bike = bike;
    }

    public void allocatingBikeNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("Allocating Bike Number" + generator.getNextSerial());
    }
}