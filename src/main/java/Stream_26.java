import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_26 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", "Sharma", "Hyderabad", 8.38, 19, "Civil"),
                new Student("Amit", "Verma", "Delhi", 8.4, 21, "IT"),
                new Student("Suresh", "Reddy", "Chennai", 7.5, 20, "Civil"),
                new Student("Kiran", "Patel", "Mumbai", 9.1, 20, "IT"),
                new Student("Arjun", "Naidu", "Bengaluru", 7.83, 20, "Civil")
        );

//        1. Find students from Hyderabad with a grade greater than 8.0
            List<String> resHy = students.stream().filter(s -> s.city.equals("Hyderabad") && s.grade > 8.0).map(Student::Firstname).toList();
        System.out.println(resHy);
//        2. Find the student with the highest grade
            Student resHG = students.stream().max(Comparator.comparingDouble(Student::grade)).orElse(null);
        System.out.println(resHG);
//        3. Count the number of students in each department
        Map<String , Integer> resDepCount = students.stream().collect(Collectors.groupingBy(
                Student::department,
                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
        ));

        System.out.println(resDepCount);
//        4. Find the average grade per department
        Map<String, Double> resAvgGra = students.stream().collect(
                Collectors.groupingBy(
                        Student::department,
                        Collectors.averagingDouble(student -> Math.round(student.grade * 100.0) / 100.0)
                )
        );

        resAvgGra.replaceAll((dept, avg) -> Math.round(avg * 100.0) / 100.0);

        System.out.println(resAvgGra);
//        5. List students sorted by age and then by grade
        List<Student> resSortAgeGrade = students.stream()
                .sorted(Comparator.comparingInt(Student::age))
                .sorted(Comparator.comparingDouble(Student::grade))
                .toList();
        resSortAgeGrade.forEach(s -> System.out.println(s.Firstname + " " + s.age +  " " + s.grade));
//        6. Create a comma-separated list of student names
            List<String> resNames = students.stream().map(s -> s.Firstname + " " +  s.lastname).toList();
        System.out.println(resNames);
//        7. Check if all students are above 18
        boolean resAbove18 = students.stream().allMatch(s -> s.age > 18);
        System.out.println(resAbove18);
//        8. Find the department with the most students
//        9. Divide students into those who have grades above 8.0 and below
//        10. Find the student with the longest full name


    }

    record Student(
            String  Firstname, String  lastname, String  city, double  grade, int age , String  department
    ){}
}
