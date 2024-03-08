 import java.util.Scanner;

 public class Gradecalculator {
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter Number of subjects :- ");
         int noOfsub = scan.nextInt();
         int Sub;
         int totalMarks=0;
         for(int i=1; i<=noOfsub; i++){
             System.out.print("Enter marks of this subject : ");
             Sub = scan.nextInt();
             if(Sub < 0 || Sub > 100){
                 System.out.println("Invalid entry ");
             }
             totalMarks = totalMarks + Sub;
         }
         int Avg = totalMarks/noOfsub;
         if(totalMarks >= 200){
             System.out.println("PASS");
         }
         else{
             System.out.println("FAIL");
         }
     }
 }

