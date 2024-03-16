package Opps;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void setReal(int Real){
        this.real=Real;
    }
    public void setImaginary(int Imaginary){
        this.imaginary = Imaginary;
    }
    public int GetReal(){
        return real;
    }
    public int GetImaginary(){
        return imaginary;
    }
    public void print() {
        System.out.println(real + " + " + "i" +imaginary );
    }
    public void plus(ComplexNumber c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    //(a + ib) (c + id) = (ac - bd) + i(ad + bc).
    public void multiply(ComplexNumber other) {
        int real = this.GetReal();
        int imaginary = this.GetImaginary();
        
        int tempReal =   (real * other.real) - (imaginary * other.imaginary);
        int tempImaginary =  (this.real * other.imaginary) + (this.imaginary * other.real);;
       setReal(tempReal);
       setImaginary(tempImaginary);
    
    }
     
}
