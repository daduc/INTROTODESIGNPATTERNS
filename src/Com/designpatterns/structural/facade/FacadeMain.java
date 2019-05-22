package Com.designpatterns.structural.facade;

import Com.designpatterns.base.DownHill;
import Com.designpatterns.base.WideWheel;

public class FacadeMain {
    public static void main(String[] args) {
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));
    }

    }

