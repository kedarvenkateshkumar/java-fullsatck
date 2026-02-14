package Encapsulation;
class Bank{

    private double balance=1000;
    
    public void deposite(double amount){
        
        if(amount > 0) {
            this.balance += amount;
            System.out.println("New Balance: "+this.balance);
        }else{
            System.out.println("Invalid balance.");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposite(100);
        bank.deposite(100);
        
    }
}