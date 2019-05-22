package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.BikeInterface;

public class GoldFrameOption extends AbstratBikeOption {
    GoldFrameOption(BikeInterface bike){
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 300.00f;

    }
    public String toString(){
        return getClass().getSimpleName() + " ("+getWheel()+", GOLG price = "+getPrice()+")";
    }
}
