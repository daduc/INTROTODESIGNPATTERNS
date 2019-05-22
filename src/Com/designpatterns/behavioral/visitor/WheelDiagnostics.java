package Com.designpatterns.behavioral.visitor;

import Com.designpatterns.base.WheelInterFace;
public class WheelDiagnostics implements WheelVisitorInterface {

    public void visit(WheelInterFace wheel){

        System.out.println("Diagnosing Bike wheel");
    }
    public void visit(Spokes spokes){
        System.out.println("Diagnosing wheel spokes");
    }
    public void visit(Bearings bearings) {
        System.out.println("Diagnosing wheel bearings");
    }
}
