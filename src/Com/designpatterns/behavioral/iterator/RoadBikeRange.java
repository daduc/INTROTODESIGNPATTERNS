package Com.designpatterns.behavioral.iterator;

import Com.designpatterns.base.BikeInterface;
import Com.designpatterns.base.NarrowWheel;
import Com.designpatterns.base.Touring;
import Com.designpatterns.base.Vintage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoadBikeRange implements Iterable<BikeInterface> {
    private List<BikeInterface> bikes;
    public RoadBikeRange(){
        bikes = new ArrayList<BikeInterface>();
        bikes.add(new Touring(new NarrowWheel(22)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new Vintage(new NarrowWheel(24)));
        bikes.add(new Vintage(new NarrowWheel(22)));
    }
    public List<BikeInterface> getRange(){
        return bikes;
    }
    public Iterator<BikeInterface> iterator(){
        return bikes.listIterator();
    }
}
