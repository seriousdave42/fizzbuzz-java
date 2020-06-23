import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner fizzBuzzInput = new Scanner(System.in);
        System.out.println("Enter integer:");
        int number = fizzBuzzInput.nextInt();
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(number);
        System.out.println("FizzBuzz machine says: " + result);
        fizzBuzzInput.close();
    }
}