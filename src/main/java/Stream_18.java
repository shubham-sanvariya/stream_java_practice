import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_18 {
//    Convert the list of sentences into unique words
    public static void main(String[] args) {
        List<String> sentences = List.of("java is cool", "cool code in java");
        Set<String> unique = sentences.stream().flatMap(x -> Arrays.stream(x.split(" "))).collect(Collectors.toSet());
        System.out.println(unique);
    }
}
