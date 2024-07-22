package basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(5,8);
        boolean sumCorrect = ResultChecker.assertEquals(13, sumResult);
        if (sumCorrect) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(5,8);
        boolean subCorrect = ResultChecker.assertEquals(-3, subtractResult);
        if (subCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.power(5);
        boolean powCorrect = ResultChecker.assertEquals(25, powerResult);
        if (powCorrect) {
            System.out.println("Metoda power działa poprawnie dla liczy " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " + a);
        }

    }
}
