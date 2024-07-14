public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(5);
        System.out.println("Area of the Circle with radius 5 equals: " + area);

        double p = Calculator.PI;           // przed kropką nazwa klasy a nie obiektu
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
