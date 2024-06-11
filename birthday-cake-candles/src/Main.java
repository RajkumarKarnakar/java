import java.util.Scanner;

public class Main {
    static int birthdayCakeCandles(int[] ar) {
        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFrequency = 0;
        for (int n : ar) {
            if (n == maxCandleHeight) maxCandleFrequency++;
            if (n > maxCandleHeight) {
                maxCandleHeight = n;
                maxCandleFrequency = 1;
            }
        }
        return maxCandleFrequency;
    }

    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age: ");
        age = sc.nextInt();
        int[] candles = new int[age];
        System.out.println("\nEnter the heights of: " + age + " candles");
        for (int i = 0; i < age; i++) {
            candles[i] = sc.nextInt();
        }
        System.out.println("candles blown out: " + birthdayCakeCandles(candles));
    }
}