package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;

public abstract class BikeDirector {
    public abstract BikeInterface build(BikeBuilder builder);
}
