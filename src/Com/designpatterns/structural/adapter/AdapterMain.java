package Com.designpatterns.structural.adapter;

import Com.designpatterns.base.NarrowWheel;
import Com.designpatterns.base.WheelInterFace;
import Com.designpatterns.base.WideWheel;

import java.util.ArrayList;
import java.util.List;
public class AdapterMain {
    public static void main(String[] args) {
        UltraWheel ultraWheel = new UltraWheel(28);
        List<WheelInterFace> wheels = new ArrayList<WheelInterFace>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(ultraWheel));
        for (WheelInterFace wheel : wheels) {
            System.out.println(wheel);
        }
    }
}
