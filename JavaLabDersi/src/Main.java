import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("\nEXERCISE 1: Factorial \n\nEnter the factorial number: ");
        int number=input.nextInt();

        int answer=factorial(number);
        System.out.println("The factorial of the number you entered is (" + number + "!): " + answer);

        System.out.println("\n-------------------------------------------\n\nEXERCISE 2: Calculate The Number Of Eulers\n");
        System.out.print("Enter the number of terms (The higher the number of terms, the clearer the euler number!) :");
        int termCount=input.nextInt();
        double answer2=euler(termCount);
        System.out.println("E number: "+answer2);

        System.out.println("\n-------------------------------\n\nEXERCISE 3: Put spaces in the digits\n");
        System.out.print("Enter a number: ");
        int new_number=input.nextInt();
        String answer3=digitByDigit(new_number);
        System.out.println(answer3);
    }

    public static int factorial(int number1){

        int factorial=1;
        if(number1==1 || number1==0){
            return 1;
        }

        for(int i=2; i<=number1; i++){
            factorial *= i;
        }

        return factorial;
    }

    public static double euler(int termCount){

        // e = 1 + 1/1! + 1/2! + 1/3! + ...
        double e=1.0;
        for(int i=1; i<termCount; i++){
            e += 1.0 / factorial(i);
        }
        return e;
    }

    public static String digitByDigit(int new_number){

        String numberString="";

        while(new_number>0){

            int mod=new_number % 10;
            numberString = mod + numberString;
            new_number = new_number / 10;

            if(new_number>0)
                numberString=" " + numberString;

        }
        return numberString;
    }

}
