package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.BikeInterface;

public class LeatherSeatOption extends AbstratBikeOption {
    LeatherSeatOption(BikeInterface bike){
        super(bike);
    }
    public float getPrice(){
        return decoratedBike.getPrice()
                +40.00f;
    }
}
