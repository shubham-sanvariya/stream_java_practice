import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_20 {
//    Find all the Longest words in a list
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange",
                "pineapple", "blueberry");

        int maxLength = words.stream().max(Comparator.comparingInt(String::length)).get().length();

        List<String > res = words.stream().filter(x -> x.length() == maxLength).toList();
        System.out.println(res);
    }
}
