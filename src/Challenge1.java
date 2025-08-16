void main() {
    Scanner sc = new Scanner(System.in);
    print("enter your name ");
    String aaron = sc.nextLine();
    print("enter a number ");
    int r = sc.nextInt();
    int b = 0;
    if (r == 0) {
        return;
    }
    while (b < r - 1) {
        print(aaron + "-");
        b++;
    }
    print(aaron);
    println();
}
