package Com.designpatterns.base;

import Com.designpatterns.BikeColor;

public class Touring extends RoadBike {
    public Touring(WheelInterFace wheel) {
        this(wheel, BikeColor.BLUE);
    }

    public Touring(WheelInterFace wheel, BikeColor color) {
        super(wheel, color);
    }

    //the following method is for the Decorator pattern
    public float getPrice() {
        return 570.00f;
    }

}
