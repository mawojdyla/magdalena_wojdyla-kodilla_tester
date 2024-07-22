package basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double power(double a) {
        return Math.pow(a, 2);    // Rzutowanie (int) przed Math.pow(a, 2) oznacza,
                                        // że chcemy przekonwertować wynik operacji Math.pow
    }                                  // (który jest typu double) na typ int.
}
