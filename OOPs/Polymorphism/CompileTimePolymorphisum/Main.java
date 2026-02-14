package Polymorphism.CompileTimePolymorphisum;

import java.util.Scanner;

class Sum{
    public Sum(int a,int b){
        System.out.println(a+b);
    }
    public Sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public void show(){
        System.out.println("Ends here  .");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Sum sum1 = new Sum(a,b);
        sum1.show();
        Sum sum2 = new Sum(a,b,c);
        sum2.show();
        sc.close();


        
    }
}
