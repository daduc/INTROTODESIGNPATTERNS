package Com.designpatterns.base;
import Com.designpatterns.behavioral.visitor.Bearings;
import Com.designpatterns.behavioral.visitor.Spokes;
import Com.designpatterns.behavioral.visitor.WheelVisitorInterface;
public class AbstractWheel implements WheelInterFace {
    private int size;
    private boolean wide;
    //part of visitor pattern
    private Spokes spokes;
    private Bearings bearings;
    public AbstractWheel(int size, boolean wide){
        this.size = size;
        this.wide = wide;
        //part of the visitor pattern

        spokes = new Spokes();
        bearings = new Bearings();

    }
    public int getSize(){
        return size;
    }

    @Override
    public int geSize() {
        return 0;
    }

    public boolean isWide(){
        return wide;
    }
    //pattern of the visitor pattern
    public void acceptVisitor(WheelVisitorInterface visitor){
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at  "+size+" inches";
    }
}
