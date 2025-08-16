void main(){
    println("enter a number");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = (int)Math.pow(2,a);
    println(b);
    double c = (double)b/6;
    int d = (int)Math.round(c);
    println(d);
    int da = d;
    int e = b - d;
    int f = b;
    int g = 1;
    println(e);
    double[][] players = new double[2][f];
    while(g <= b){
        players[0][g-1] = g*1.0;
        players[1][g-1] = 0.0;
        g++;
    }
    double h = Math.random();
    String role;
    while(b > 0){
        if(h >= (double)da/f) {
            role = "naughty numberblock";
            players[1][b-1] = 1.0;
            da--;
            f--;
        } else {
            role = "good numberblock";
            f--;
        }
        b--;
    }
}
