package Com.designpatterns.base;

import Com.designpatterns.BikeColor;
public abstract class MountainBike extends AbstractBike{
    protected MountainBike(WheelInterFace wheel){
        this(wheel, BikeColor.CHROME);
    }
    protected MountainBike(WheelInterFace wheel, BikeColor color){
        super(wheel, color);
    }
}
