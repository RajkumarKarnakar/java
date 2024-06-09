public class Main {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        //OR

        String hash = "#";
        for (int i = 0; i < n; i++) {
            System.out.format("%"+n+"s\n",hash);
            hash +="#";
        }
    }
}