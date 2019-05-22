package Com.designpatterns.base;
import Com.designpatterns.behavioral.visitor.VisitableInterface;

public interface WheelInterFace extends VisitableInterface{
    int geSize();
    boolean isWide();
    //The extends for this interface is used in the Visitor pattern
}

