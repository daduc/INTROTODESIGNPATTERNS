package Com.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    public static final int SPEED_TO_ALERT = 30;
    public void update(Observable obs, Object arg){
        Speedometer speedo = (Speedometer) obs;
        if(speedo.getCurrentSpeed() > SPEED_TO_ALERT){
            System.out.println("**ALERT** Riding too fast ! ("+speedo.getCurrentSpeed() +")");
        }
        else{
            System.out.println("...nice and steady... ("+speedo.getCurrentSpeed() + ")");
        }
    }
}
