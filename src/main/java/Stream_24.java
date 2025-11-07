import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_24 {

//    Most Repeated Number in a given list.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8,5, 30, 25, 30,5);

        int res = Math.toIntExact(numbers.stream().collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .max((x, y) -> Math.toIntExact(x.getValue() - y.getValue()))
                .map(Map.Entry::getKey)
                .orElse(0));

        System.out.println(res);
    }
}
