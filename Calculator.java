import java.util.*;

public class Calculator {

    public static void main(String[] args){
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the 1st number: ");
            double number1 = scan.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double number2 = scan.nextDouble();

            System.out.println("Select operation to perform : ");
            System.out.println("1. Addition - ");
            System.out.println("2. Subtraction - ");
            System.out.println("3. Multiplication - ");
            System.out.println("4. Division - ");
            System.out.println("5. Exit");
            System.out.println("Choose any option");
            double Choose = scan.nextInt();
            if(Choose==1){
                double Result=number1+number2;
                System.out.println(Result);
            }
            else if(Choose==2){
                double Result=number1-number2;
                System.out.println(Result);
            }
            else if(Choose==3){
                double Result=number1*number2;
                System.out.println(Result);
            }
            else if(Choose==4){
                double Result=number1/number2;
                System.out.println(Result);
            }
            else if(Choose==5){
                System.out.println("Thank you");
                scan.close();
                return;

            }
            else{
                System.out.println("Incorrect option choosed");
            }
        }
    }
}

