public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height) {    // czy refaktoryzacja może być przeprowadzona za pomocą 'Extract'?
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean isOlderThan30() {
        return age > 30;
    }

    public boolean isTallerThan160() {
        return height > 160;
    }

    public void showInfo() {
        if (name != null) {
            if (isOlderThan30() && isTallerThan160()) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
//    public void showInfo() {
//        if (this.name != null) {
//            if (this.age > 30 && this.height > 160) {
//                System.out.println("User is older than 30 and taller than 160cm");
//            } else {
//                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
//            }
//        }
//    }
    public static void main(String[] args) {
        Application userA = new Application("Adam", 40.5, 178);
        userA.showInfo();
    }
}

// Refaktoryzacja- zamiana kodu strukturalnego na obiektowy
//public class Application {
//    public static void main(String[] args) {
//        String name = "Adam";
//        double age = 40.5;
//        double height = 178;
//
//        if (name != null) {
//            if (age > 30 && height > 160) {
//                System.out.println("User is older than 30 and taller than 160cm");
//            } else {
//                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
//            }
//        }
//    }
//}

