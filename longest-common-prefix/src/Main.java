import javax.imageio.spi.ServiceRegistry;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"flower", "flaw", "flow"};
        System.out.println(Arrays.toString(arr));
        System.out.println(longestCommonPrefix(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static String longestCommonPrefix(String[] a) {
        int size = a.length;
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return a[0];
        }
        Arrays.sort(a);

        int end = Math.min(a[0].length(),a[size-1].length());
        int i = 0;
        while (i<end && a[0].charAt(i)==a[size -1].charAt(i))
            i++;
        return a[0].substring(0,i);
    }
}