package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                // wyrażenie lambda, to "funkcja", przez którą "przepuszczamy" obiekty
                .collect(Collectors.toList());  // Kolekcjonowanie do listy, metoda gromadzi wszystkie elementy strumienia w nowej liście List<String>.
        return usernames;
    }

    public static List<String> getFilteredUsernames() {
        return filterChemistGroupUsernames();
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> getUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static int getUserAge(User user) {
        return user.getAge();
    }

    public static List<String> getUsersNamesByPartOfTheName(String partOfTheName) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getUsername().contains(partOfTheName))
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
    }
}

/*
public static List<User> filterUsersOlderThan45(int age) - '<User>' metoda statyczna zwracająca kolekcję elementów typu User;
przyjmująca argument typu int
 */
