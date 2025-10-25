import java.util.Arrays;
import java.util.List;

public class Stream_10 {
//     program to perform cube on list elements and filter numbers greater than 80.
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(3,2,4,5,10,24,52,7,9);
        List<Integer> res = elements.stream().mapToInt(x -> (int) Math.pow(x,3)).filter(x -> x < 80).boxed().toList();
        System.out.println(res);
    }
}
