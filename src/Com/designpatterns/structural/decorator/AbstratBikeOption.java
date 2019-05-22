package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.AbstractBike;
import Com.designpatterns.base.BikeInterface;

public class AbstratBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;
    public AbstratBikeOption(BikeInterface bike){
        super(bike.getWheel());
        this.decoratedBike = bike;
    }
}
