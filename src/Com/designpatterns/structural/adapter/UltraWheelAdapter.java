package Com.designpatterns.structural.adapter;

import Com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UltraWheel ultraWheel){
        super(UltraWheel.getWheelSize(), false);
    }
}
