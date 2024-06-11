import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is sock sale there are sock color coded " +
                "this program will return total pairs of socks");
        int[] socks = new int[]{10, 10, 10, 12, 10, 12, 10, 5};
        System.out.println(socksPairCount(socks));
    }

    public static int socksPairCount(int[] arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }
        return count;
    }
}