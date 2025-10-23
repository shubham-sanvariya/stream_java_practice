import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort in descending order
public class Stream_3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
        List<Integer> res = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
        System.out.println(res);
    }
}
