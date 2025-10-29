import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream_16 {
//    Reverse each word of a string
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String reversed = Arrays.stream(str.split(" "))
                .map(x -> new StringBuilder(x).reverse() + " ").collect(Collectors.joining()).trim();
        System.out.println(reversed);
    }
}
