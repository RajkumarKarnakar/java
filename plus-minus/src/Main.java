public class Main {
    public static void main(String[] args) {
        System.out.println("this program will tell fractions of positives, negatives and zeros in the array");
        int[] numbers = new int[]{ 5, 68, 12, 0, -5, 5, 84, -45};
        double positivesCount = 0;
        double negativesCount = 0;
        double zerosCount = 0;
        int length = numbers.length;
        for (int number : numbers) {
            if (number > 0)
                positivesCount++;
            if (number < 0)
                negativesCount++;
            if (number == 0)
                zerosCount++;
        }
        System.out.format("Positives: %.3f\n", (positivesCount / length));
        System.out.format("Negatives: %.3f\n", negativesCount / length);
        System.out.format("Zeros: %.3f\n", zerosCount / length);
    }
}