package Com.designpatterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Generating Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial" + generator.getNextSerial());
        System.out.println("next serial" + generator.getNextSerial());
        System.out.println("next serial" + generator.getNextSerial());
    }
}
