import java.util.List;

public class Stream_19 {
//     get distinct characters from a list of words
    public static void main(String[] args) {
        List<String> words = List.of("java", "scala");
        List<Character> res = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).distinct().toList();
        System.out.println(res);
    }
}
