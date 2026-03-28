void main() {
    println("Enter number of terms");
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = a*2-1;
    long c = 1;
    double d = 0.0;
    long e = 1;
    while(c <= b) {
        println(e);
        if(c%4 == 3) {
            d = d-1/(double)c;
        } else {
            d = d+1/(double)c;
        }
        e++;
        c = c+2;
    }
    println(d*4);
}
