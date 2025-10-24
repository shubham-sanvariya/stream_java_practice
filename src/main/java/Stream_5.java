import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_5 {
//     Find Max Number in a list
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);
        System.out.println(numbers.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0));
    }
}
