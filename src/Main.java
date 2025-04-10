
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREATE AN INSTANCE OF SCANNER OBJECT
        //pass in input stream to use for reading
        Scanner myScanner = new Scanner(System.in);

        // get desired operator +-/*
        // get two numbers,
        // add them together,
        // and display the sum

        System.out.print("Enter a single operator.\ne.g. '+', '-', '*', or '/':\n");
        String operator = myScanner.next(); //get string

        System.out.print("Enter first number: ");
        //read next integer from the input stream (console/terminal)
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number: ");
        //read second integer from the input stream AKA console
        int num2 = myScanner.nextInt();

        // total up the two together into a sum
        int result = 0;

        if(operator.equals("+")){
            result = num1 + num2;
        }else if(operator.equals("-")){
            result = num1 - num2;
        }else if(operator.equals("*")){
            result = num1 * num2;
        }else if(operator.equals("/")){
            result = num1 / num2;
        }

        System.out.println("The result is " + result);
    }
}
