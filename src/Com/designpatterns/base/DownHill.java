package Com.designpatterns.base;
import Com.designpatterns.BikeColor;
public class DownHill extends MountainBike {
    public DownHill(WheelInterFace wheel){

        this(wheel, BikeColor.GREEN);
    }
    public DownHill(WheelInterFace wheel, BikeColor color) {

        super(wheel, color);
    }
    //the following is for the decorator method
    public float getPrice(){
        return 870.00f;
    }
}
