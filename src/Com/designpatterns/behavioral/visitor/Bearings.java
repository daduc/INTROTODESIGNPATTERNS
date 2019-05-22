package Com.designpatterns.behavioral.visitor;

public  class Bearings implements VisitableInterface {
    public void acceptVisitor(WheelVisitorInterface visitor){
        visitor.visit(this);
    }
}
