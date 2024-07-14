//public class AdvCalculator {
//    public double calculate() {
//        String userSelected = UserDialogs.getUserSelection();
//        int a = UserDialogs.getValue();
//        int b = UserDialogs.getValue();
//        return switch (userSelected) {
//            case "ADD" -> a + b;
//            case "SUB" -> a - b;
//            case "DIV" -> a / b;
//            case "MUL" -> a * b;
//            default -> 0;
//        };
//    }
//}

public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        return switch (userSelected) {
            case "ADD" -> a + b;
            case "SUB" -> a - b;
            case "DIV" -> a / b;
            case "MUL" -> a * b;
            default -> 0;
        };
    }
}

//Nowoczesne wyrażenie switch w Javie nie używa tradycyjnych instrukcji break.
//Zamiast tego używa strzałek ->, aby określić wartości zwracane przez każdy przypadek.
//        To sprawia, że kod jest bardziej zwięzły, czytelny i mniej podatny na błędy związane z zapominaniem o break.



