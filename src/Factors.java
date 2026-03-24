void main() {
    print("enter a number ");
    Scanner sc = Tools.scanner;
    int a = sc.nextInt();
    int b = 1;
    int c = 0;
    while(b <= a) {
        if(a % b == 0) {
            print(b + " ");
            c++;
        }
        b++;
    }
    println();
    println(c + " factors");
}
