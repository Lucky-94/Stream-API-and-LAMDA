import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 15);
        Optional<Integer> greaterThan10 = numbers.stream().filter(n -> n>10).findFirst();

        if(greaterThan10.isPresent()){
            System.out.println(greaterThan10);
        }else System.out.println("The value is not present");
        //System.out.println(greaterThan10.get());
    }
}
