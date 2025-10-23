import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Stream_1 {
    public static void main(String[] args) {
        // Remove duplicates without distinct()
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        List<Integer> res = new HashSet<>(duplicateNumbers).stream().toList();
        System.out.println(res);

    }
}
