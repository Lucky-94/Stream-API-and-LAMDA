import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task1 {
    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
       List<Integer> processedNum =  numbers.stream().filter(n -> n%2 ==1).map(n -> n*n).sorted(Comparator.reverseOrder()).toList();
       processedNum.forEach(System.out::println);
    }
}