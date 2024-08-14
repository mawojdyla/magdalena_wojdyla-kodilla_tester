import com.kodilla.stream.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    // Metoda pomocnicza
    private List<User> testCollectionOfUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));             // >= 40
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));   // < 40
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));  // < 40
        users.add(new User("Gus Firing", 49, 0, "Board"));                  // >= 40
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));          // >= 40
        users.add(new User("Maria Olsen", 41, 10, "Security"));             // >= 40
        users.add(new User("Tim Knight", 39, 3, "Security"));       // < 40
        return users;
    }

    @Test
    public void testGetAvgPostsFor40AndOlder() {    // 40, 41, 100, 1000
        List<User> users = testCollectionOfUsers();
        ForumStats stats = new ForumStats(users);

        // obliczanie średniej liczby postów users >= 40 lat
        double avgPostsOlder = stats.getAvgPostsFor40AndOlder();

        // Użytkownicy w wieku >= 40: Walter - 7 postów, Gus - 0, Gale - 2, Maria - 10
        // Oczekiwana średnia: (7 + 0 + 2 + 10) / 4 = 4.75
        assertEquals(4.75, avgPostsOlder, 0.01);
    }

    @Test
    public void testGetAvgPostsForYoungerThan40() { // 0, 10, 39
        List<User> users = testCollectionOfUsers();
        ForumStats stats = new ForumStats(users);
       // users < 40
        double avgPostsYounger = stats.getAvgPostsForYoungerThan40();
            // Użytkownicy w wieku < 40: Jessie - 4648 postów, Tuco - 116, Tim - 3
            // Oczekiwana średnia: (4648 + 116 + 3) / 3 = 1589.0
            assertEquals(1589.0, avgPostsYounger, 0.01);
        }
    }

/*
Warunki Brzegowe
Brak użytkowników: Możesz dodać testy sprawdzające, czy metody zwracają 0.0 dla pustej listy użytkowników.
Wszystkie posty równe zero: Dodaj testy, które sprawdzają, czy średnia jest poprawna, gdy wszyscy użytkownicy mają zero postów.
Wszyscy użytkownicy w jednej grupie wiekowej: Przetestuj przypadki, gdy wszyscy użytkownicy należą do jednej z grup wiekowych.
 */
