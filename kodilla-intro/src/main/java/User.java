public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = new User[6];
        
        users[0] = new User("Adela", 18);
        users[1] = new User("Adam", 25);
        users[2] = new User("Barbara", 26);
        users[3] = new User("Bogdan", 30);
        users[4] = new User("Celina", 32);
        users[5] = new User("Cezary", 33);

        int totalAge = sum(users);
        System.out.println("Całkowity wiek wszystkich użytkowników: " + totalAge);

        double avgAge = averageAge(users);
        System.out.println("Średnia wieku wszystkich użytkowników: " + avgAge);

        System.out.println("Użytkownicy poniżej średniej wieku:");
        printUsersBelowAverageAge(users, avgAge);

    }

    public static int sum(User[] users) {
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        return result;
    }

    public static double averageAge(User[] users) {
        int totalAge = sum(users);
        return (double) totalAge / users.length;
    }

    public static void printUsersBelowAverageAge(User[] users, double averageAge) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }

}
