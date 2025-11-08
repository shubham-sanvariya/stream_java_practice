import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_25 {

//    Frequency of words or count of each word in a String
    public static void main(String[] args) {
        String sentence = "Java is fun and java is powerful";
        Map<String , Integer> res = Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                ));

        System.out.println(res);
    }
}
