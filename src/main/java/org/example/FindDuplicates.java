package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1);
        List<Integer> duplicates = findDuplicates(numbers);

        System.out.println("Duplicates: " + duplicates);
    }

    public static List<Integer> findDuplicates(List<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (Integer number : list) {
            // If the number has already been seen, add it to duplicates
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        return new ArrayList<>(duplicates); // Convert to List before returning
    }
}
