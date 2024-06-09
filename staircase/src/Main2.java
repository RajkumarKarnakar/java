public class Main2 {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1, c = 1; k <= i; k++) {
                if (c <= 1)
                    System.out.print("[");
                c++;
            }
            System.out.println("|");
        }
    }
}