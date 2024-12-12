package Student;


import java.util.*;

public class Main {
    static ArrayList<Student> students;

    public static void main(String[] args) {

        students = new ArrayList<>(Arrays.asList(
                new Student("Aibek", 20, "java"),
                new Student("Mirbek", 19, "js"),
                new Student("Nurbek", 21, "java"),
                new Student("Akylay", 27, "java"),
                new Student("Sezim", 20, "js"),
                new Student("Kanykey", 22, "java"),
                new Student("Murat", 23, "js"),
                new Student("Cabyr", 24, "js"),
                new Student("Akyl", 25, "java"),
                new Student("Asan", 26, "js")
        ));
        for (Student student : students) {
            System.out.println(student);
        }

        filtration();
        sortingAge();
        sortingName();

    }


    public static void filtration() {
        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();
        for (Student student : students)
            if (student.getGroup().equalsIgnoreCase("js")) js.add(student);
            else java.add(student);

        System.out.println("Group java:");
        for (Student ja : java)
            System.out.println(ja);
        System.out.println("Group JS:");
        for (Student j : js)
            System.out.println(j);
    }

    public static void sortingAge() {
        ArrayList<Student> age = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() >= 19 && student.getAge() <= 23) age.add(student);
        }
        System.out.println("Student sorting age: ");
        for (Student studentAge : age)
            System.out.println(studentAge);

    }

    public static void sortingName() {
        ArrayList<Student> nameA = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().startsWith("A"))
                nameA.add(student);
        }
        System.out.println("Studend name go A : ");
        for (Student student : nameA) {
            System.out.println(student);
        }
    }
}