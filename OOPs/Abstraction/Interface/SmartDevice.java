package Abstraction.Interface;

interface SmartDevice{
    void turnOn();
    void trunOff();
    String getDeviceName();
}

class SmartLamp implements SmartDevice{
    public void turnOn(){
        System.out.println("the lamp is turn ON");
    }

    public void trunOff(){
        System.out.println("the lamp is turn OFF");
    }

    public String getDeviceName(){
        return "Living Room Lamp";
    }
}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("the Fan is turn ON");
    }

    public void trunOff(){
        System.out.println("the fan is turn OFF");
    }

    public String getDeviceName(){
        return "Living Room Fan";
    }
}



