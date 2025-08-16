void main() {
    print("Enter a value for n ");
    Scanner sc = Tools.scanner;
    int n = sc.nextInt();
    double r = Math.sqrt(n);
    int ri = (int) r;
    println(r);
    println(ri);
    double d = Math.abs(ri - r);
    println(d);
    if (d < 0.000000000000001) {
        println("perfect square");
    } else {
        println("not perfect square");
    }
}
