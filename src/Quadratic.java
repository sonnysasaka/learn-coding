void main () {
    Scanner sc = new Scanner(System.in);
    print("enter a");
    double a = sc.nextInt();
    print("enter b");
    double b = sc.nextInt();
    print("enter c");
    double c = sc.nextInt();
    double d = b * b - 4 * a * c;
    if (d < 0) {
        String r1 = String.format("%.2f", (-b / (2.0 * a))) + "+"
            + String.format("%.2f", (Math.sqrt(-d) / 2 * a)) + "i";
        String r2 = String.format("%.2f", (-b / (2.0 * a))) + "-"
            + String.format("%.2f", (Math.sqrt(-d) / 2 * a)) + "i";
        println(r1 + " , " + r2);
    } else {
        double r1 = (-b + Math.sqrt(d))/(2*a);
        double r2 = (-b - Math.sqrt(d))/(2*a);
        print(r1 +",");
        println(r2);
    }
}
