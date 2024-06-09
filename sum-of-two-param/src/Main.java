import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.println("Please enter the first digit");
        if (input.hasNextInt())
            a = input.nextInt();
        else input.next();
        System.out.println("Please enter the second digit");
        if (input.hasNextInt())
            b = input.nextInt();
        sum = summing(a, b);
        System.out.print("----------\nSum is: " + sum);
    }

    private static int summing(int x, int y) {
        return x + y;
    }
}