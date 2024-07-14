public class Loops {
    String[] names = {"Zygfryd", "Gwidon", "Florentyna"};
    int[] numbers = {16, 26, 88, 9, 14, 25};

    public int sumOfNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];

        }
        return result;
    }
}



