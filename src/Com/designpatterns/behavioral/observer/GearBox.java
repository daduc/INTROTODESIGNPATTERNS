package Com.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class GearBox implements Observer {
    public void update(Observable obs, Object arg){
        Speedometer speedo = (Speedometer) obs;
        if(speedo.getCurrentSpeed() <= 5){
            System.out.println("Now in easy gear");
        }
        else if(speedo.getCurrentSpeed() <= 10){
            System.out.println("now in 2nd gear");
        }
        else if(speedo.getCurrentSpeed() <= 20){
            System.out.println("now in 3rd gear");
    }
        else if(speedo.getCurrentSpeed() <= 25) {
            System.out.println("now in 4th gear");
        }
        else if(speedo.getCurrentSpeed() <= 30) {
            System.out.println("now in 5th gear");
        }
    }
}
