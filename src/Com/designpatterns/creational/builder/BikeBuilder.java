package Com.designpatterns.creational.builder;

import Com.designpatterns.base.BikeInterface;

public abstract class BikeBuilder {
    abstract BikeInterface getBike();
    public void buildStreetTires(){
    }
    public void buildWideTires(){

    }
    public void buildHandleBars(){

    }
}
