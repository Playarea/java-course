import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subram", "Hari", "Sam", "Jyothi", "Mohit");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperNames);

        //Using forEach
        upperNames.forEach(System.out::println);

    }
}
