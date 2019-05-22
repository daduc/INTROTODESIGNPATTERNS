package Com.designpatterns.base;

import Com.designpatterns.BikeColor;
public class CrossCountry extends MountainBike {
    public CrossCountry(WheelInterFace wheel){
        this(wheel, BikeColor.ORANGE);
    }
    public CrossCountry(WheelInterFace wheel, BikeColor color){
        super(wheel, color);
    }
    //the following is for the decorator pattern
    public float getPrice(){
        return 850.00f;
    }
}
