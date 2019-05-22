package Com.designpatterns.behavioral.visitor;

import Com.designpatterns.base.WheelInterFace;

public class WheelInventory implements WheelVisitorInterface {
    private int spokesCount;
    private int bearingsCount;
    public WheelInventory(){
        spokesCount = 30;
        bearingsCount = 2;
    }
    public void visit(WheelInterFace wheel){
        System.out.println("The wheel has: "+ spokesCount + "spokes and" +" bearings");
    }
    public void visit(Spokes spokes){
        spokesCount++;
    }
    public void visit(Bearings bearings){
        bearingsCount++;
    }
}
