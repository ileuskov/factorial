import java.math.BigInteger;

public class Factorial {
    BigInteger num;

    public Factorial(BigInteger num) {
        this.num = num;
    }

    public BigInteger factorial() { // A method that uses iteration to calculate the factorial of a number
        BigInteger factorial = new BigInteger("1"); // Initializing the variable that stores value of 1
        for (int i = 1; i <= num.intValue(); i++) { // Running through the loop as many times as the number given by user
            factorial = factorial.multiply(new BigInteger(String.valueOf(i))); // each time the factorial is multiplied with a higher number until the user's number is reached
        }
        return factorial; // returning the variable
    }

    public BigInteger factorial_recursion(BigInteger num) { // A method that uses recursion to calculate the factorial of a number
        if (num.equals(BigInteger.ZERO)) { // catching the only "tricky" place of the method. If a user's number is 0 the returned values is 1
            return BigInteger.ONE;
        } else {
            return num.multiply(factorial_recursion(num.subtract(BigInteger.ONE))); // In all the other cases the value of an argument num is multiplied by the recursive call of this method. In this recursive call the value of the num is decreased by 1 each time until it is equal to 1
        }
    }
}
