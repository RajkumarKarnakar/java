import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] timeScale = new int[]{-1, 0, 0, -1, 0, 1, 1, 0, 1, -1, 0, 0};
        angryProfessor(10, timeScale);

    }

    private static void angryProfessor(int min, int[] arr) {
        int studentOnOrBeforeCount = 0;
        studentOnOrBeforeCount = (int) Arrays.stream(arr).filter(i -> i <= 0).count();
        if (studentOnOrBeforeCount >= min) {
            System.out.println("class is happy");
        } else {
            System.out.println("class is canceled");
        }
    }
}