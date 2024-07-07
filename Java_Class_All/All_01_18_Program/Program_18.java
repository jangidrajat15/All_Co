import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Program_18 {
    public static void main(String[] args) {
        // Lambda Expression Example
        Runnable lambdaRunnable = () -> System.out.println("Hello from lambda expression!");
        lambdaRunnable.run();

        // Functional Interface Example
        MyFunctionalInterface myFunc = () -> System.out.println("Hello from functional interface!");
        myFunc.myMethod();

        // Stream API Example
        List<String> myList = Arrays.asList("Java", "Python", "C++", "JavaScript");
        myList.stream()
                .filter(s -> s.startsWith("J"))
                .forEach(System.out::println);

        // Optional Class Example
        String name = "John";
        Optional<String> optionalName = Optional.ofNullable(name);

        // If value is present, it prints the value; otherwise prints "No value present"
        optionalName.ifPresentOrElse(
                value -> System.out.println("Name: " + value),
                () -> System.out.println("No value present")
        );
    }

    // Additional method to satisfy Java application structure
    public void myMethod() {
        System.out.println("This is another method.");
    }
}
