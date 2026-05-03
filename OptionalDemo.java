import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subram", "Hari", "Sam", "Jyothi", "Mohit");

        String name = names.stream()
                .filter(str -> str.contains("y"))
                .findFirst()
                .orElse("Not Found");
        System.out.println(name);
    }
}