package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    private List<User> users;

    public ForumStats(List<User> users) {
        this.users = users;
    }

    public double getAvgPostsFor40AndOlder() {       // >=40
        return users.stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(0.0);
    }

    public double getAvgPostsForYoungerThan40() {      // <40
        return users.stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        ForumStats stats = new ForumStats(users);

        double avgPostsOlder = stats.getAvgPostsFor40AndOlder();
        System.out.println("Średnia liczba postów dla użytkowników w wieku >= 40: " + avgPostsOlder);

        double avgPostsYounger = stats.getAvgPostsForYoungerThan40();
        System.out.println("Średnia liczba postów dla użytkowników w wieku < 40: " + avgPostsYounger);
    }
}
