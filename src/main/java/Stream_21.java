import java.util.Arrays;
import java.util.List;

public class Stream_21 {
//     Sum of numbers
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 10, 4);
        int sum = numbers.stream().reduce(0,(acc, cur) -> {
                acc += cur;
                return acc;
                // -> acc + cur
        });

        System.out.println(sum);

//        Find Maximum using reduce

        int max = numbers.stream().reduce(0,(acc, cur) -> {
           if (acc < cur) acc = cur;
           return acc;
        });

        System.out.println(max);
    }
}
