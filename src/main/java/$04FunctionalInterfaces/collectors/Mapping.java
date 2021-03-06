package $04FunctionalInterfaces.collectors;

import $04FunctionalInterfaces.streams.Collect;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Dmitrii on 12.02.2018.
 */
public class Mapping {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("lions", "tigers", "bears");

        Map<Integer, String> mapping = animals.stream().collect(
                Collectors.groupingBy(String::length,
                        Collectors.mapping(
                                s -> s.substring(0, 1),
                                Collectors.joining(",")
                        )
                )
        );
        System.out.println(mapping); // {5=l,b, 6=t}


        Map<Integer, Optional<Character>> minBy = animals.stream().collect(
                Collectors.groupingBy(String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy(Comparator.comparingInt(s -> s))
                        )
                )
        );
        System.out.println(minBy);
    }
}
