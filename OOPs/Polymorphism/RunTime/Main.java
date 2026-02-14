package Polymorphism.RunTime;

class Payment{
    public void process(){
        System.out.println("processing normal payment");
    }
}
class Phonepay extends Payment{
    @Override
    public void process(){
        System.out.println("processing payment via phonepay.");
    }
}
class Paytm extends Payment{
    @Override
    public void process(){
        System.out.println("processing payment via paytm.");
    }
}

public class Main {
    public static void main(String[] args) {
        Phonepay p1 = new Phonepay();
        p1.process();

        Paytm p2 = new Paytm();
        p2.process();
    }
}
