import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ConstructorReferenceDemo{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subram", "Hari", "Sam", "Jyothi", "Mohit");

        List<Student> studentList = new ArrayList<>();

//        for (String name : names) {
//            studentList.add(new Student(name));
//        }

        //Using Streams
//        studentList = names.stream()
//                        .map(name -> new Student(name))
//                                .toList();
//        System.out.println(studentList);

        studentList = names.stream()
                .map(Student::new)
                .toList();
        System.out.println("Using Constructor Reference : \n" + studentList);
    }
}
