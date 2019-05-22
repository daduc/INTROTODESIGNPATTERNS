package Com.designpatterns.behavioral.visitor;

import Com.designpatterns.base.WheelInterFace;

public interface WheelVisitorInterface {
     public void visit(WheelInterFace wheel);
     public void visit(Spokes spokes);
     public void visit(Bearings bearings);

}
