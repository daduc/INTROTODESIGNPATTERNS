package Com.designpatterns.behavioral.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private  int currentSpeed;
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public Speedometer(){
        currentSpeed = 0;
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed = speed;
        setChanged();
        notifyObservers();
    }
}
