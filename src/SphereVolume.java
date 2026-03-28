String Volume(double r) {
    return 4/3.0*r*r*r + " pi";
}
void main() {
    print("What is r? --> ");
    Scanner sc = Tools.scanner;
    double r = sc.nextDouble();
    double n = 0;
    while(n <= r) {
        String v = Volume(n);
        print(n + " ");
        println(v);
        n++;
    }
    String v = Volume(r);
    println(v);
}
