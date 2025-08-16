void main() {
    int n = ((int) (Math.random() * 100)) + 1;
    // println(n);
    Scanner sc = new Scanner(System.in);
    int f = 0;
    while (true) {
        print("guess my number:");
        int r = sc.nextInt();
        if (r < n) {
            println("too low");
        } else if (r > n) {
            println("too high");
        } else {
            println("correcto you guessed " + (f + 1) + " times");
            break;
        }

        f++;
        if (f == 10) {
            println("you lose");
            break;
        }
    }
}
