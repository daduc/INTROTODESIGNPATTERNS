package Com.designpatterns.structural.decorator;

import Com.designpatterns.base.BikeInterface;

public class CustomGripsOption extends AbstratBikeOption {
    CustomGripsOption(BikeInterface bike) {
        super(bike);
    }
        public float getPrice(){
            return decoratedBike.getPrice()
                    +20.00f;


        }
    }

