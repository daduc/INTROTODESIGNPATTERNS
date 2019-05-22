package Com.designpatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {

        //Create the Speed Monitor
        SpeedMonitor monitor = new SpeedMonitor();
        //Create a Speedometer and register the monitor to it
        Speedometer speedo = new Speedometer();
        speedo.addObserver(monitor);
        speedo.addObserver(new GearBox());
        //Pedal at different speeds
        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(20);
        speedo.setCurrentSpeed(30);
        speedo.setCurrentSpeed(35);
    }
}


