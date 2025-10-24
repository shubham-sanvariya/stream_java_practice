import java.util.Arrays;
import java.util.List;

public class Stream_6 {
//    Check all numbers even or not
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

//        boolean res = numbers.stream().filter(x -> x % 2 == 0).toList().size() == numbers.size();
        boolean res = numbers.stream().allMatch(x -> x % 2 == 0);
        System.out.println(res);
    }
}
