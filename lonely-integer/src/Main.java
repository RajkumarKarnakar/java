public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 1, 0, 3, 3};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println("lonely int is: " + result);
    }
}