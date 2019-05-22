package Com.designpatterns.behavioral.visitor;

import Com.designpatterns.base.WheelInterFace;
import Com.designpatterns.base.WideWheel;

public class VisitorMain {
    public static void main(String[] args) {
        WheelInterFace wheel = new WideWheel(24);
        //run diagnostics
        wheel.acceptVisitor(new WheelDiagnostics());
        //run inventory
        wheel.acceptVisitor(new WheelInventory());
    }
}
