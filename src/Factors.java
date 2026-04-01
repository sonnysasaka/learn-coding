void main() {
    print("enter a number ");
    Scanner sc = Tools.scanner;
    long a = sc.nextLong();
    long b = 1;
    long c = 0;
    String d = "";
    while(b <= Math.sqrt(a)) {
        if(a % b == 0) {
            print(b + " ");
            c++;
            c++;
            if(a/b == b) {
                c--;
            } else {
                d = a/b + " " + d;
            }
        }
        b++;
    }
    println(d);
    println(c + " factors");
}
