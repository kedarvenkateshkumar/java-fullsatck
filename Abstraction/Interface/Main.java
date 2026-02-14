package Abstraction.Interface;

class RemoteControlle{
    public void turnOnDevice(SmartDevice device){
        System.out.println("Action: toggling "+device.getDeviceName());
        device.turnOn();
    }
    public void trunOffDevice(SmartDevice device){
        System.out.println("Action toggling "+device.getDeviceName());
        device.trunOff();
    }
}
public class Main {
    public static void main(String[] args) {
        RemoteControlle remote = new RemoteControlle();

        SmartDevice lamp = new SmartLamp();
        SmartDevice fan = new SmartFan();

        remote.turnOnDevice(lamp);
        remote.turnOnDevice(fan);
        System.out.println();
        remote.trunOffDevice(fan);
        remote.trunOffDevice(lamp);
    }
}
