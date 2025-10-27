import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_12 {
//    Get 3rd highest element from the list
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95,
                14, 56, 87);

        int res = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
        System.out.println(res);
    }
}
