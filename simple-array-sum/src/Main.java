import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("please enter the array size");
        int n = sc.nextInt();
        int[] numbs = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            numbs[i] = sc.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(numbs));
        arraySum(numbs);
        bigSumOfArray(numbs);

    }

    private static void arraySum(int[] arr) {
        System.out.println("Sum is: " + Arrays.stream(arr).sum());
    }
    private static void bigSumOfArray(int[] arr){
        System.out.println("Sum is: "+Arrays
                .stream(Arrays.stream(arr).mapToLong(i-> i)
                        .toArray()).sum());
    }
}