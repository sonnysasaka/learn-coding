
double FToC(double f) {
    double x = f - 32;
    return (x) * 5 / 9;
}

double CToF(double c) {
    return 32 + (c * 9 / 5);
}

void main() {
    Scanner sc = Tools.scanner;

    print("Enter a temperature and the unit: ");
    double n = sc.nextDouble();
    String u = sc.nextLine().trim();

    /*
     * println("n = " + n);
     * println("u = " + u);
     */

    if (u.charAt(0) == 'c') {
        println(CToF(n) + " f");
    } else if (u.charAt(0) == 'f') {
        println(FToC(n) + " c");
    } else {
        println("unit not found");
    }
}
