public class Main2 {
    public static void main(String[] args) {
        Main2 example = new Main2();
        String[] arr = new String[]{"hi", "hello"};
        System.out.println("Longest common prefix: " + example.longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        String result = arr[0];
        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "-1";
                }
            }
        }
        return result;
    }
}