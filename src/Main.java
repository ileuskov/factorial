
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Initializing a scanner
        System.out.println("Welcome to the factorial calculator! Please enter a number greater than or equal to 0 and you will get its factorial:");
        BigInteger num = s.nextBigInteger(); // Initializing a BinInteger variable to be able to calculate large numbers

        while (num.intValue() < 0) { // Making sure the user doesn't type the negative numbers
            System.out.println("The factorial for the negative numbers is undefined. Please enter a number greater than or equal to zero");
            num = s.nextBigInteger();
        }

        BigInteger result = factorial(num); // Initializing a variable that stores the value returned by the factorial method
        System.out.println("Your result is: " + result); // Printing out the result

        System.out.println("Would you like to try the recursion way of finding a factorial as well? Please type yes or no: ");
        String answer = s.next(); // Reading the user's answer whether he/she wants to continue or not

        if (answer.equals("yes")) { // if the user wants to continue we run the this part of the code
            System.out.println("Happy to hear that! Please enter your number. Same as before: no negative numbers ;) ");
            BigInteger num2 = s.nextBigInteger(); // Reading the number from user

            while (num2.intValue() < 0) { // Making sure the user doesn't type the negative numbers
                System.out.println("The factorial for the negative numbers is undefined. Please enter a number greater than or equal to zero");
                num2 = s.nextBigInteger();
            }
            s.close(); // Closing the scanner

            BigInteger result_recursion = factorial_recursion(num2); // Initializing a variable that stores the value returned by the recursion factorial method
            System.out.println("Your result is: " + result_recursion); // Printing out the result
        }
    }

    public static BigInteger factorial(BigInteger num) { // A method that uses iteration to calculate the factorial of a number
        BigInteger factorial = new BigInteger("1"); // Initializing the variable that stores value of 1
        for (int i = 1; i <= num.intValue(); i++) { // Running through the loop as many times as the number given by user
            factorial = factorial.multiply(new BigInteger(String.valueOf(i))); // each time the factorial is multiplied with a higher number until the user's number is reached
        }
        return factorial; // returning the variable
    }

    public static BigInteger factorial_recursion(BigInteger num) { // A method that uses recursion to calculate the factorial of a number
        if (num.equals(BigInteger.ZERO)) { // catching the only "tricky" place of the method. If a user's number is 0 the returned values is 1
            return BigInteger.ONE;
        } else {
            return num.multiply(factorial_recursion(num.subtract(BigInteger.ONE))); // In all the other cases the value of an argument num is multiplied by the recursive call of this method. In this recursive call the value of the num is decreased by 1 each time until it is equal to 1
        }
    }

}
