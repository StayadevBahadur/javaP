package Opps;

public class ComplexNumUse {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(6, 7);
        c1.print();
        c2.print();         
        // c1.plus(c2);
        c1.print();
        c1.multiply(c2);
        c1.print();
        
    }
  
}
