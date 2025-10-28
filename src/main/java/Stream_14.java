import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_14 {
//     Sum of all digits in a number
    public static void main(String[] args) {

        int i = 15623;
        int res = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::valueOf).sum();
        System.out.println(res);
    }
}
