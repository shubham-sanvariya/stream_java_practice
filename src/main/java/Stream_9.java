import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_9 {
//    Find the longest word in a list
public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
    String res = words.stream().max(Comparator.comparing(String::length)).orElse("");
    System.out.println(res);

    // find the kth longest word
    int k = 2 - 1; // -1 because of indexing
    String kLong = words.stream().sorted(Comparator.comparing(String::length).reversed()).skip(k).toList().getFirst();
    System.out.println(kLong);
}
}
