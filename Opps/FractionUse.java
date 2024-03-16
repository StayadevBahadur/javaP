package Opps;

public class FractionUse {
    public static void main(String[] args){
        Fraction f1 = new Fraction(20, 30);
        f1.print();
        f1.setNumerator(12);
       int d =  f1.getDenominator();
        System.out.println(d);
        f1.print();
        f1.setNumerator(10);
        f1.setDeminator(30);
        f1.print();

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);
        f1.print();
        f1.multily(f2);
        f1.print();
        

    }
}
