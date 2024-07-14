import java.util.Scanner;

public class UserColour {
    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color - type first letter (B-blue, G-green, P-pink, R-red):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "BLUE";
                case "G":
                    return "GREEN";
                case "P":
                    return "PINK";
                case "R":
                    return "RED";
                default:
                    System.out.println("Wrong selection. Try again.");
            }
        }
    }
//    public static String getLetter() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first letter of color:");
//        String letter = scanner.nextLine();
//        return letter;
//
//    }

}




