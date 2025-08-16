void main() {
    Scanner sc = Tools.scanner;

    print("Enter your name: ");
    String name = sc.nextLine();

    println("Hello, " + name);
    println("Your name has " + name.length() + " letters");
    for (int c = 0; c < name.length(); c++) {
        System.out.println(name.charAt(c));
    }
}
