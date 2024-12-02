
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Task2{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api", "lambda");
        List<String> newWords = words.stream().map(String::toUpperCase).filter(x -> x.length()>=4).sorted(Comparator.reverseOrder()).toList();
        newWords.forEach(System.out::println);
    }
}