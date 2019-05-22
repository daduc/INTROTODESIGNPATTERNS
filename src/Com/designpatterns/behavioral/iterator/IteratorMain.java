package Com.designpatterns.behavioral.iterator;

import Com.designpatterns.base.BikeInterface;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        iteratorPattern();
        //Iterator pattern v2
    }
    private static void iteratorPattern(){
        System.out.println("===Our Road Bike===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());
        System.out.println("===Our Mountain Bike ====");
        MountainBikeRange mountainBikeRange = new MountainBikeRange();
        printIterator(mountainBikeRange.iterator());
    }
    private static void printIterator(Iterator iter){
        while(iter.hasNext());
        System.out.println(iter.next());
    }
    private static void iteratorPatternV2(){
        System.out.println("===Our RoadBike===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        for(BikeInterface bikes : bikeRange.getRange()){
            System.out.println(bikes);
        }
        System.out.println("===Our Mountain Bikes===");
        MountainBikeRange mountainBikeRange = new MountainBikeRange();
        for(BikeInterface bikes : mountainBikeRange.getRange()){
            System.out.println(bikes);
        }
    }
}
