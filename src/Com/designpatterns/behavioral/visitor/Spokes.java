package Com.designpatterns.behavioral.visitor;

public class Spokes implements VisitableInterface {
    public void acceptVisitor(WheelVisitorInterface visitor){
        visitor.visit(this);
    }
}
