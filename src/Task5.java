import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 9, 1, 5);
        numbers.stream().max(Integer::compareTo).ifPresent(x -> System.out.println("Max: " + x));
        numbers.stream().min(Integer::compareTo).ifPresent(x -> System.out.println("Min: " + x));
    }
}
