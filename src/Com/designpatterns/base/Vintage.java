package Com.designpatterns.base;
import Com.designpatterns.BikeColor;

public class Vintage extends RoadBike{
    public Vintage(WheelInterFace wheel){
        this(wheel, BikeColor.RED);
    }
    public Vintage(WheelInterFace wheel, BikeColor color){
        super(wheel, color);
    }
    //the following method is for decorator pattern
    public float getPrice(){
        return 600.00f;
    }
}
