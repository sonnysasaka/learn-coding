void main() {
    Scanner sc = new Scanner(System.in);

    while (true) {
        print("enter a word ");
        String aaron = sc.nextLine();
        if (aaron.equals("peachy") || aaron.equals("tiny")
                || aaron.equals("broccoli") || aaron.equals("apple")) {
            println("correct!");
            break;
        } else {
            println("wrong!");
        }
    }
}
