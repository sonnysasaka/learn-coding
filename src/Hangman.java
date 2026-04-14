void main() {
    String secret = "banana";
    Scanner sc = Tools.scanner;
    while (true) {
        print("Secret word: ");
        println("_ _ _ _ _ _");
        println("What is your guess:");
        String guess = sc.nextLine();
        println("Your guess is: " + guess);
    }
}
