package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector {

    public BikeInterface build(BikeBuilder builder){
        builder.buildHandleBars();
        builder.buildWideTires();
        return builder.getBike();
    }
}
