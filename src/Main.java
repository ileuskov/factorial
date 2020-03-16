
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigInteger a = s.nextBigInteger();
        s.close();

        BigInteger result = factorial(a);
        System.out.println(result);

    }

    public static BigInteger factorial(BigInteger a) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= a.intValue(); i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial;
    }

   /* public static BigInteger factorial_recursion(int a) {
        BigInteger factorial = new BigInteger(String.valueOf(a));
        if (a == 0) {
            return BigInteger.ONE;
        else{
                return factorial.multiply(factorial_recursion(factorial.subtract(BigInteger.ONE)));
            }
        }
    }

    */
}
