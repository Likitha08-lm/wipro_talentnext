package javafundamentals;

public class Arrays_1 {

	public static void main(String[] args) {
		int[] numbers = {25, 48, 12, 5, 98, 63, 37};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
	}
}
