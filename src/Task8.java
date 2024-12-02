import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple",
                "orange", "banana", "banana");
        Map<String, Long> counting = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(counting);
    }
}
