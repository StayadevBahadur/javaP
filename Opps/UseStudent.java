package Opps;

public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Satyadev",148);
        Student s2 = new Student("Riya",147);
        s1.name = "Satyadev";
        // s1.setRollNum(-1);
        // System.out.println(s1.name);
        // System.out.print(s1.getRollNum());
        s1.print();
        s2.print();
   
    }
    
}
