package $04FunctionalInterfaces.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAndCount {

    public static void main(String[] args) {
        GroupAndCount groupAndCount = new GroupAndCount();
        System.out.println(groupAndCount.groupCharactersAndCount("apple"));
    }

    public Map<Character, Long> groupCharactersAndCount(String str) {
        Stream<Character> stream = str.chars().mapToObj(i->(char)i);
        return stream.collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }
}
