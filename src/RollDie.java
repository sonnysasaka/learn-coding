void main(){
    println("enter number of faces on the die ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double b = Math.random();
    int c = (int)(b*a+1);
    int d = 1;
    while(d <= a){
        b = Math.random();
        c = (int)(b*a+1);
        println(c);
        d++;
    }
}
