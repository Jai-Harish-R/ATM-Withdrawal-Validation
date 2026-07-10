import java.util.*;
public class Bank{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE DETAILES TO FIND THAT YOU ARE ELIGIBLE TO GET LOAN OR NOT");

      System.out.print("Enter your Name : ");
      String name=sc.nextLine();

      System.out.print("Enter your Age: ");
      int age=sc.nextInt();

      System.out.print("Enter your Salary : ");
      float salary =sc.nextFloat();

     System.out.println("Enter your Credit Score : ");
     int cscore=sc.nextInt();
    
     if(age>=21 && salary>=300000 && cscore>=700){
         System.out.println("Hi "+name+"!!!!");
         System.out.println("Loan Approved");
         return;
      }
      System.out.println("Hi "+name+"!!!!");
      System.out.print("Loan Rejected");  
   }
}