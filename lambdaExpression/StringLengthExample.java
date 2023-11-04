package collections.lambdaExpression;


public class StringLengthExample {
    public static void main(String[] args) {
        // Implementation using a lambda expression
        StringLengthCalculator calculator = (str) -> str.length();

        // Calculate the length of a string
        String input = "Hello, World!";
        int length = calculator.calculateLength(input);

        System.out.println("The length of the string is: " + length);
    }
}
