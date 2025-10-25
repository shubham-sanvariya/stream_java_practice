import java.util.Arrays;
import java.util.List;

public class Stream_7 {
//    Numbers starting with 1
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);
        List<Integer> res = numbers.stream().filter(x -> String.valueOf(x).startsWith("1")).toList();
        System.out.println(res);
    }
}
