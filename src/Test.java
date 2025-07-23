// Java 8+ - Lambda expressions
import java.util.*;
// import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== Java Version Feature Test ===");

        // Java 8 - Lambda expressions
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        items.forEach(item -> System.out.println("Java 8 Lambda: " + item));

        // Java 9 - var in lambda (if source >= 11)
        items.stream()
                .map((var item) -> item.toUpperCase()) // Java 11+ feature
                .forEach(System.out::println);

        // Java 10 - Local variable type inference
        var message = "Java 10+ var keyword works!";
        System.out.println(message);

        // Java 14 - Switch expressions (preview in 12-13, standard in 14)
        var day = "MONDAY";
        var typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Java 14+ Switch Expression: " + typeOfDay);

        // Java 14 - Text blocks (preview in 13, standard in 15)
        var textBlock = """
                This is a Java 15+ text block.
                It spans multiple lines
                and preserves formatting.
                """;
        System.out.println("Java 15+ Text Block:");
        System.out.println(textBlock);

        // Java 16 - Pattern matching for instanceof (preview in 14-15, standard in 16)
        Object obj = "Hello Pattern Matching";
        if (obj instanceof String str && str.length() > 10) {
            System.out.println("Java 16+ Pattern Matching: " + str.toUpperCase());
        }

        // Java 17 - Sealed classes would require additional files

        // Java 21 - Pattern matching in switch (preview in 17-20, standard in 21)
        testPatternMatchingSwitch("Hello World");
        testPatternMatchingSwitch(42);
        testPatternMatchingSwitch(null);

        // Java 21 - Virtual threads (preview feature)
        try {
            testVirtualThreads();
        } catch (Exception e) {
            System.out.println("Virtual threads not available: " + e.getMessage());
        }

        // Java 22+ - Unnamed variables (preview)
        try {
            var list = List.of("a", "b", "c");
            for (var _ : list) { // Java 22+ unnamed variable
                System.out.println("Java 22+ unnamed variable in loop");
                break; // Just show it works
            }
        } catch (Exception e) {
            System.out.println("Unnamed variables not available");
        }

        // Debug: Print actual source level info
        printSourceLevel();
    }

    // Java 21 - Pattern matching in switch
    static void testPatternMatchingSwitch(Object obj) {
        var result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println("Java 21+ Pattern Switch: " + result);
    }

    // Java 21 - Virtual threads
    static void testVirtualThreads() throws InterruptedException {
        Thread.ofVirtual()
                .name("virtual-thread")
                .start(() -> {
                    System.out.println("Java 21+ Virtual Thread: " + Thread.currentThread());
                })
                .join();
    }

    static void printSourceLevel() {
        System.out.println("\n=== Runtime Information ===");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Specification: " + System.getProperty("java.specification.version"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.name"));
        System.out.println("Java VM: " + System.getProperty("java.vm.name"));
    }
}
