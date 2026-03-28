String SurfaceArea(double r) {
    return 4*r*r +" pi";
}
void main() {
    print("What is r? --> ");
    Scanner sc = Tools.scanner;
    double r = sc.nextDouble();
    double n = 0;
    while(n <= r) {
        String sa = SurfaceArea(n);
        print(n + " ");
        println(sa);
        n++;
    }
    String sa = SurfaceArea(r);
    println(sa);
}
