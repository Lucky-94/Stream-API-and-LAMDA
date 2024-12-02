import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,
                1000000).boxed().collect(Collectors.toList());
        int parallelNums = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(parallelNums);
    }
}
