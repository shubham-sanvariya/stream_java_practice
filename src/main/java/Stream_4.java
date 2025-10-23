import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_4 {
//    sort them according to increasing order of their length
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL",
                "C");

        List<String > res = listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(res);

//        sort the given list of decimals in reverse order
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> dres = decimalList.stream().sorted(Comparator.comparingDouble(Double::doubleValue).reversed()).toList();
        System.out.println(dres);
    }
}
