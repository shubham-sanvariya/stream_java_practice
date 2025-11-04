import java.util.Arrays;
import java.util.List;

public class Stream_22 {
//    Find the longest common prefix using Java streams
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("flower", "flow", "flight");

        String res = strings.stream().reduce((acc,curr) -> {
           int length = Math.min(acc.length(),curr.length());
           int i = 0;
           while (i < length && acc.charAt(i) == curr.charAt(i)){
               i++;
           }
           return acc.substring(0,i);
        }).orElse("");

        System.out.println(res);
    }
}
