package Com.designpatterns.structural.adapter;

public class UltraWheel {
    private static int size;

    public UltraWheel(int size){
        this.size = size;
    }

    
    public static int getWheelSize(){
        return size;
    }
    public String toString(){
     return "ULTRA WHEEL" + " ("+size+") inches";
    }
}
