package org.utils.Stupid;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StupidSolution {

    public static void main(String[] args) {

        List<Person> persons1 = new ArrayList<>();
        List<Person> persons2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            persons1.add(new Person());
            persons2.add(new Person());
        }

    }

    public static List<Person> mergePersons(List<Person> list1, List<Person> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toMap(
                        Person::getId,
                        p -> new Person(
                                p.getId(),
                                p.getName(),
                                p.getLastName(),
                                new ArrayList<>(Optional.ofNullable(p.getDocuments()).orElseGet(ArrayList::new)),
                                new ArrayList<>(Optional.ofNullable(p.getAddresses()).orElseGet(ArrayList::new))
                        ),
                        (p1, p2) -> {
                            p1.getDocuments().addAll(p2.getDocuments());
                            p1.getAddresses().addAll(p2.getAddresses());
                            return p1;
                        }
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}



