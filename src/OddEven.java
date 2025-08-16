void main() {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    print("Enter a number: ");
    int n = input.nextInt();

    if (n % 2 == 0) {
        println("Even");
    } else {
        println("Odd");
    }
}
