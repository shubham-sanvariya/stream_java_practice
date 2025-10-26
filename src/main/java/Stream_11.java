import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_11 {

//    Merge two unsorted arrays into single sorted array in desc order
    public static void main(String[] args) {
        int[] a = new int[] { 4, 2, 7, 1 };
        int[] b = new int[] { 8, 3, 9, 5 };
        int[] c = Stream.concat(
                Arrays.stream(a).boxed(), Arrays.stream(b).boxed()
        ).sorted((x,y) -> y - x)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(c));
    }
}
