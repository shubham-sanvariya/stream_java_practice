import java.util.Arrays;
import java.util.List;

public class Stream_8 {
//    Find Palindrome Strings
    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil",
                "Malayalam");

        List<String> res = palindromeNames.stream().filter(x -> x.toLowerCase().contentEquals(new StringBuilder(x.toLowerCase()).reverse())).toList();
        System.out.println(res);
    }
}
