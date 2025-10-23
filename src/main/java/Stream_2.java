import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Stream_2 {

    //  Get duplicates
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> seen = new HashSet<>();

        List<Integer> res = duplicateNumbers.stream().filter(x -> !seen.add(x)).toList();
        System.out.println(res);

        // to long method
//        Map<Integer, Long> map = duplicateNumbers.stream().collect(Collectors.groupingBy(
//                Integer::intValue,
//                Collectors.counting()
//        ));
//
//        List<Integer> list = map.entrySet().stream().filter((k) -> k.getValue() > 1).mapToInt(Map.Entry::getKey).boxed().toList();
//        System.out.println(list);
    }
}
