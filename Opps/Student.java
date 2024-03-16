package Opps;

public class Student {
    String name;
   private final int rollNum;
   public Student(String name,int rollNum){
    this.name = name;
   this.rollNum = rollNum;
   numStudent++;

   }
   static int numStudent;
   public void print(){
    System.out.println(name +" : "+ rollNum);
   }
    public int getRollNum(){
        return rollNum ;
    }
    // public void setRollNum(int n){
    //     if(n<=0){
    //         return;
    //     }
    //     rollNum = n;
    // }

// String name;
// int rollNo;
// Student(int num){
// rollNo = num;
// }   

}
