package Com.designpatterns.base;
import Com.designpatterns.BikeColor;
public abstract class RoadBike extends AbstractBike {

    protected RoadBike(WheelInterFace wheel){
        this(wheel, BikeColor.BLACK);
    }


protected RoadBike(WheelInterFace wheel, BikeColor color) {
    super(wheel, color);
}
}
