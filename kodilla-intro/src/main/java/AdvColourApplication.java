public class AdvColourApplication {
    public static void main(String[] args) {
        UserColour getUserColour = new UserColour();
        String result = UserColour.getUserColour();
        System.out.println("Result: " + result);
    }
}
