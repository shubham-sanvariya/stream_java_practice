import java.util.Arrays;
import java.util.List;

public class Stream_17 {
//    Count the number of occurrences of a given String
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
                String word = "java";

        int count = (int) strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(x -> x.equals(word)).count();
        System.out.println(count);
    }
}
