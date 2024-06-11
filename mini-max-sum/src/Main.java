import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 6, 9, 7, 3};
        miniMaxSum(nums);
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int maxSum = Arrays.stream(arr).filter(i -> i > arr[0]).sum();
        int minSum = Arrays.stream(arr).filter(i -> i < arr[arr.length - 1]).sum();
        System.out.format("Min sum: %d\nMax sum: %d", minSum, maxSum);
    }
}