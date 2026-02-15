package Hashmap;

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<>();

        //Adding student name and Roll numbers
        student.put("Venkatesh",605);
        student.put("Lokesh",606);
        student.put("Pavan",604);
        student.put("Satish",603);
        student.put("Somu",602);
        student.put("Chandu",601);

        for(String name : student.keySet()){
            System.out.println("Student name is "+name + " Reg.No: "+student.get(name));
        }
    }
}
