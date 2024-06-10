import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{10, 20, 30}, {15, 25, 35}, {1, 2, 3}};

        for (int[] a : matrix) {
            for (int i : a) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
        System.out.println("diagonal difference of matrix is: " + diagonalDifference(matrix));

    }

    private static int diagonalDifference(int[][] arr) {
        int diff = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i][i];
            leftSum += arr[i][arr.length - 1 - i];
        }
        diff = rightSum - leftSum;
        return Math.abs(diff);
    }
}