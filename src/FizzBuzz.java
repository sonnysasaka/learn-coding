void main() {
    println("welcome to fizzbuzz");
    Scanner input = new Scanner(System.in);
    print("enter a number ");
    int j = input.nextInt();
    int b = 1;
    while (b <= j) {
        if (b % 3 == 0) {
            if (b % 5 == 0) {
                println("fizzbuzz");
            } else {
                println("fizz");
            }
        } else if (b % 5 == 0) {
            if (b % 3 != 0) {
                println("buzz");
            } else {
            }
        } else {
            println(b);
        }
        b++;
    }
}
