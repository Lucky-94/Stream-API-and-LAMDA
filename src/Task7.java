import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 5, 3, 7);
        List<Integer> distinctList = numbers.stream().distinct().sorted().toList();
        System.out.println(distinctList);
    }
}
