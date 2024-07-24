import java.util.Random;

public class RandomNumbers {

    private int min = Integer.MAX_VALUE; // 30  Zmienne prywatne: min, max, sum i random są zadeklarowane
    private int max = Integer.MIN_VALUE; // 0   jako prywatne zmienne instancji, aby mogły być dostępne wewnątrz metod klasy.
    private int sum = 0;                        // Inicjalizuje max jako minimalną możliwą wartość, aby każda losowa liczba była większa.
                                                //Inicjalizuje min jako maksymalną możliwą wartość, aby każda losowa liczba była mniejsza.
    private Random random = new Random();

    public void generateNumbers() {
        while (sum <= 50) {
            int randomNumber = random.nextInt(31); //losuje liczbę z zakresu 0-30
            sum = sum + randomNumber;

            if (randomNumber > max) {
                max = randomNumber;
            }
            if (randomNumber < min) {
                min = randomNumber;
            }

            System.out.println("Wylosowana liczba: " + randomNumber + " aktualna suma: " + sum);
        }

    }

    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }

    public static void main(String[] args) {    // Metoda main - punkt wejścia programu, pierwsza uruchamiana metoda
                                                // tworzy instancję klasy, wywołuje generateNumbers i wypisuje wyniki.
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();
        System.out.println("Ostateczna suma: " + randomNumbers.sum);
        System.out.println("Największa wylosowana liczba: " + randomNumbers.getMax());
        System.out.println("Najmniejsza wylosowana liczba: " + randomNumbers.getMin());
    }
}
