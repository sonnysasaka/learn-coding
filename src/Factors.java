void main() {
    print("enter a number ");
    Scanner sc = Tools.scanner;
    long a = sc.nextLong();
    long b = 1;
    long c = 0;
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
