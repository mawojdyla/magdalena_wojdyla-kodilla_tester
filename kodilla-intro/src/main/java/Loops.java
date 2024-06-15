public class Loops {
    static String[] names = {"Zygfryd", "Gwidon", "Florentyna"};
    static int[] numbers = {16, 26, 88, 9, 14, 25};


    public static void main(String[] args) {
        // Iterowanie po tablicy names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    // Tworzenie instancji klasy tylko do wywołania metody sumOfNumbers
    int sum = new Loops().sumOfNumbers(numbers);
    System.out.println("Total of numbers is " + sum) ;


    }

// Metoda sumOfNumbers pozostaje niestatyczna
    public int sumOfNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];

        }
        return result;
    }
}



