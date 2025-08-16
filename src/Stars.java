void starline(int x) {
    int c = 0;
    while (c < x) {
        print("*");
        c++;
    }
    println();
}

void main() {
    Scanner sc = new Scanner(System.in);
    print("How big? ");
    int n = sc.nextInt();

    int r = 1;
    while (r <= n) {
        starline(r);
        // println(r);
        r++;
    }
    r--;
    while (r > 1) {
        starline(r - 1);
        // println(r);
        r--;
    }
    // n = 5
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
}
