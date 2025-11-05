import java.util.stream.IntStream;

public class Stream_23 {
//    Max Product in a given array
    public static void main(String[] args) {
        int[] array = { 1, 4, 9, 6, 2, 7, 8 };

        int max_product = IntStream.range(0,array.length)
                .map(i -> IntStream.range(i + 1, array.length)
                        .map(j -> array[i] * array[j])
                        .max()
                        .orElse(0)
                ).max().orElse(0);

        System.out.println(max_product);
    }
}
