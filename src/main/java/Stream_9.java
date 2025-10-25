import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_9 {
//    Find the longest word in a list
public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
    String res = words.stream().max(Comparator.comparing(String::length)).orElse("");
    System.out.println(res);
}
}
