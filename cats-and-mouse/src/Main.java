import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter the cat a, cat b, mouse c positions");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(catAndMouse(arr[0], arr[1], arr[2]) + " Won");
    }

    static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        if (a > b) {
            return "Cat B";
        } else if (a < b) {
            return "Cat A";
        } else
            return "Mouse C";
    }
}