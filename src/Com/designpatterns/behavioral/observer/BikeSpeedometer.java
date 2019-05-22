package Com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BikeSpeedometer {
    private int currentSpeed;
    private List<SpeedometerListener> Listeners;
    public BikeSpeedometer(){
        currentSpeed = 0;
        Listeners = new ArrayList<SpeedometerListener>();
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
        fireSpeedChange(); // tell observers that something changed
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void addSpeedometerListener(SpeedometerListener obj){
        Listeners.add(obj);
    }
    public void removeSpeedometerListener(SpeedometerListener obj){
        Listeners.remove(obj);
    }
    private void fireSpeedChange(){
        SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
        for(SpeedometerListener Listen : Listeners){
            Listen.speedChange(speedEvent);
        }
    }
}
