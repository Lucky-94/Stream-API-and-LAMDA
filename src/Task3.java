import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class Task3 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 22),
                new Person("Charlie", 25)
        );
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing((Person::getName)))
                .toList();
        sortedPeople.forEach(n -> System.out.println(n));
    }

}
