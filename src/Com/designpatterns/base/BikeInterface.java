package Com.designpatterns.base;

import Com.designpatterns.BikeColor;

public interface BikeInterface {
    WheelInterFace getWheel();
    BikeColor getColor();
    void paint(BikeColor color);
    //Code below used in Decorator Pattern
    float getPrice();
    //Code below is used in the Facade Pattern
    void cleanFrame();
    void airTires();
    void testRide();


}
