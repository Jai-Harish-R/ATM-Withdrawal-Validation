import java.util.*;
public class Atm{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
       double bal=1000.00;
       int arr[]=new int[10];
       System.out.print("Enter the account Number : ");
       int acc_no=sc.nextInt();
       System.out.print("Enter the 4 digit Pin : ");
       int pass=sc.nextInt();
       int num=pass;
       int res;
       int j=0;
       while(num>0){
          res=num%10;
          arr[res]++;
          num=num/10;
          j++;
       }
       if(j!=4){
        System.out.println("Invalid PIN ");
        System.out.println("Transaction Rejected");
        return;
       }
       res=0;
       for(int i:arr){
        if(i==1){
            res++;
        }
       }
       if(res==4){
        System.out.print("Enter the amount to be withdraw : ");
        double amt=sc.nextDouble();
        if(amt>bal){
            System.out.println("Insufficient Balance");
            System.out.println("Transaction Rejected");
        }
        else{
            bal=bal-amt;
            System.out.println("Transaction Success");
        }
       }
        else{
            System.out.println("PIN should contain unique digits.");
            System.out.println("Transaction Rejected");
        }
    }
}


       

       
       
