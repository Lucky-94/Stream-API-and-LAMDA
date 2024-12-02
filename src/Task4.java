import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "ant",
                "bat");
        Map<Integer, List<String>> mappedWords = words.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println(mappedWords);
    }
}
