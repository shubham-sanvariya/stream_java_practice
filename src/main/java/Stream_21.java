import java.util.Arrays;
import java.util.List;

public class Stream_21 {
//     Sum of numbers
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        int sum = numbers.stream().reduce(0,(acc, cur) -> {
                acc += cur;
                return acc;
                // -> acc + cur
        });

        System.out.println(sum);
    }
}
