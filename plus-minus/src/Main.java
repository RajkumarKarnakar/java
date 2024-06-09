public class Main {
    public static void main(String[] args) {
        System.out.println("this program will tell fractions one positives, negatives and zeros in the array");
        int[] numbers = new int[]{-10,5,68,0,12,0,-5,5,84,-45};
        double positivesFraction = 0;
        double negativesFraction = 0;
        double zerosFraction = 0;
        int length = numbers.length;
        for (int number : numbers) {
            if (number > 0)
                positivesFraction++;
            if (number < 0)
                negativesFraction++;
            if (number == 0)
                zerosFraction++;
        }
        System.out.format("Positives: %.3f\n",(positivesFraction/length));
        System.out.format("Negatives: %.3f\n",negativesFraction/length);
        System.out.format("Zeros: %.3f\n",zerosFraction/length);
    }
}