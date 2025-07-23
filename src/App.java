import static java.lang.System.out;

void main() {
    Scanner scanner = new Scanner(System.in);

    out.print("Enter your name: ");
    String name = scanner.nextLine();
    out.println("Hello, " + name);

    scanner.close();
}
