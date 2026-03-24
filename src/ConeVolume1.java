void main() {
    println("What is r?");
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    println("What is h?");
    int h = sc.nextInt();
    println((Math.PI*r*r*h)/3);
}
