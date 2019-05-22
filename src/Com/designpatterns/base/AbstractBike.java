package Com.designpatterns.base;

import Com.designpatterns.BikeColor;

public class AbstractBike implements BikeInterface {
    private WheelInterFace wheel;
    private BikeColor color;
    protected AbstractBike(WheelInterFace wheel){
        this(wheel, BikeColor.UNPAINTED);
    }
    protected AbstractBike(WheelInterFace wheel, BikeColor color){
        this.wheel = wheel;
        this.color = color;
    }

    @Override
    public WheelInterFace getWheel() {
        return wheel;
    }
        public BikeColor getColor () {
            return color;
        }
        public void paint (BikeColor color) {
            this.color = color;
            //the following method is for decorator pattern
        }
            public float getPrice() {
                return 9000.00f;
            }
            public String toString() {
        //commented out is the original toString from base before the decorator pattern
                return getClass().getSimpleName() + "(" +wheel+" , "+color+", price = "+getPrice()+")";
            }
            public void cleanFrame() {
                System.out.println("Cleaning Frame......");
            }
            public void airTires() {
                System.out.println("Airing up tires......");
            }

            public void testRide() {
                System.out.println("Taking Bike out for a test drive");
            }
        }
