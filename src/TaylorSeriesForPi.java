void main() {
    println("Enter number of terms");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a*2-1;
    int c = 1;
    double d = 0.0;
    while(c <= b) {
        if(c%4 == 3) {
            d = d-1/(double)c;
        } else {
            d = d+1/(double)c;
        }
        c++;
        c++;
    }
    println(d*4);
}
