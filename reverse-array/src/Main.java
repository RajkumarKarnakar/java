import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"First", "Second", "Third", "Fourth", "Fifth"};
        System.out.println(Arrays.toString(names));
        System.out.println("After array reversing");
        int length = names.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = names[i];
            names[i] = names[length - 1 - i];
            names[length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}