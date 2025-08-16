void main() {
    double x = Math.random();
    double y = Math.random();
    int c = 0;
    int s = 0;
    int numDarts = 0;
    while(numDarts < 1_000_000_000) {
        if(Math.sqrt(x*x + y*y) <= 1) {
            c++;
            s++;
        } else {
            s++;
        }
        numDarts++;
        x = Math.random();
        y = Math.random();
    }
    println(c);
    println(s);
    println(((double)c/s)*4);
}
