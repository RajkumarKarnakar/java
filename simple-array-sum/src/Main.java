import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the array size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Your array is: "+ Arrays.toString(nums));
        arraySum(nums);



    }
    private static void arraySum(int[] arr){
        System.out.println("Sum is: "+Arrays.stream(arr).sum());
    }
}