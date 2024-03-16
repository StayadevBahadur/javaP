package Opps;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int n,int deno){
        this.numerator=n;
        if(deno == 0){
            return;
        }
        this.denominator = deno;
        simplify();

    }
    private void simplify(){
        int gcd = 2;
        int smaller = Math.min(numerator, denominator);
        for(int i = 1;i<=smaller;i++){
            if(numerator%i == 0 && denominator%i == 0){
                gcd=i;
            }
            
        }
        numerator=numerator/gcd;
        denominator= denominator/gcd;
    }
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int n){
        this.numerator = n;
        simplify();
    }
    public void setDeminator(int deno){
        if(deno == 0){

        }
        this.denominator = deno;
        this.simplify();
    }
    public void print(){
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }

    }
    public void add(Fraction f){
        this.numerator = this.numerator*f.denominator+this.denominator*f.numerator;
        this.denominator= this.denominator*f.denominator;
        simplify();
    }
    public void multily(Fraction f){
        this.numerator = this.numerator*f.numerator;
        this.denominator = this.denominator*f.denominator;
        simplify();
    }
    public static Fraction add(Fraction f1,Fraction f2){
        int newNum = f1.numerator*f2.denominator+f1.denominator*f2.numerator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNum, newDen);
        return f;
    }
}
