package com.java8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEg
{

    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        Map<String, List<Person>> result;
        Map<String, Long> resultInt;
        List<Person> l1 = Arrays.asList(new Person(2, "baban", "b@b.com", new Date(1991, 5, 5)),
            new Person(1, "anand", "a@a.com", new Date(1990, 1, 1)),
            new Person(4, "anand", "c@c.com", new Date(1889, 5, 7)),
            new Person(3, "baban", "d@d.com", new Date(1987, 4, 8)));

        /* List to get the person having name anand */
        result = l1.stream()
            .filter(s -> {
                if (s != null && !s.getName().equals("test"))
                {
                    return true;
                }
                else
                    return false;
            })
            .collect(Collectors.groupingBy(Person::getName));
        System.out.println("result List1 = " + result);

        /* List to get the count of all the people having name  anand */
        resultInt = l1.stream()
            .filter(s -> s.getName().equals("anand")).peek(System.out::println)
            .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println("result List2 = " + resultInt);

    }
}
