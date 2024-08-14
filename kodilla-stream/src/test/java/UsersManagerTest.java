import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        // given
        UsersManager usersManager = new UsersManager();

        // when
        List<String> result = usersManager.getFilteredUsernames();

        // then
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");
        assertEquals(expectedUsernames, result, "Lista nazw użytkowników z grupy Chemists nie jest zgodna z oczekiwaniami");
    }

    @Test
    public void filterUsersOlderThan45() {
        // given
        int ageThreshold = 45;

        // when
        List<User> result = UsersManager.getUsersOlderThan(ageThreshold);

        // then
        List<User> expectedUsers = List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Firing", 49, 0, "Board"),
                new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedUsers.size(), result.size(), "Rozmiar listy użytkowników nie jest zgodny z oczekiwaniami");

        for (User user : result) {
            assertTrue(user.getAge() > ageThreshold, "Użytkownik " + user.getUsername() + " nie spełnia kryterium wiekowego.");
        }   // można porównać całe listy expectedUsers <-> result
    }

    @Test
    public void shouldFetchUsersNamesByPartOfTheName() {
        // when
        List<String> result = UsersManager.getUsersNamesByPartOfTheName("man");
        List<String> expectedList = List.of("Jessie Pinkman", "Tuco Salamanca", "Mike Ehrmantraut", "Monica Freeman");
        assertEquals(expectedList, result, "Lista oczekiwana z podanymi znakami: " + "'man'" + "nie pokrywa się z listą rzeczywistą");

    }

}

/*
1/  średnia liczba postów w grupie 'Sales';
2/  wyszukiwanie użytkowników po nazwisku zaczynającym się na tą samą literę

 */
