package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.BikeInterface;

public class WhiteTireOption extends AbstratBikeOption {
    WhiteTireOption(BikeInterface bike){
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice()
                +80.00f;
    }
}
