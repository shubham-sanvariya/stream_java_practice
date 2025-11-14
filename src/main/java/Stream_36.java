import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_36 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("SRK","ECE",31,"Male"),
                new Employee("Salman","CS",44,"Male"),
                new Employee("Katrina","ECE",21,"Female"),
                new Employee("Kareena","CS",34,"Female"),
                new Employee("Hrithik","EEE",30,"Male"),
                new Employee("Aish","EEE",25,"Female")
        ));


//        1.Find the names of all Employees in the CS department, sorted by age in descending order
        List<String> resNaDepDes = employees.stream()
                .filter(e -> e.department.equals("CS"))
                .sorted(Comparator.comparingInt(Employee::age).reversed())
                .map(Employee::name)
                .toList();
        System.out.println(resNaDepDes);
//        2. Group Employees by department and count how many Employees are in each department
        Map<String, Integer> resDepEmpCou = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                ));

        System.out.println(resDepEmpCou);
//        3.Find the youngest female Employee.
        Employee resYouFem = employees.stream()
                .filter(e -> e.gender.equals("Female"))
                .min(Comparator.comparingInt(Employee::age))
                .orElse(null);
        System.out.println(resYouFem);
//        4. Create a map of department -> list of Employee names.
        Map<String, List<String> > resDepEmpNam = employees.stream()
                .collect(Collectors.groupingBy(
                   Employee::department,
                        Collectors.mapping(Employee::name, Collectors.toList())
                ));

        System.out.println(resDepEmpNam);
//        5. Find the average age of Employees in each department.
//        6. Get a list of unique departments Employees belong to
//        7. Partition Employees into male and female groups, then list their names.
//        8. Group employees by department, then within each department find the oldest employee
//        9. Build a map of gender with average age of employees sorted by average age descending
//        10. For each department, find the youngest employee, but instead of returning the employee object,
//        return only their name in uppercase.
//        11. Return a map where keys will be first letter of the name and value will the set of names starting with
//        that letter, no solution provided, try on your own.

    }

    record Employee(String  name, String  department, int age, String  gender ){}
}
