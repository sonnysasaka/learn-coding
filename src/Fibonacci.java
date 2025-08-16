void main(){
    print("Enter n ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 /* println(fibo(n));
    println(fibo(1));
    println(fibo(2));
    println(fibo(3));
    println(fibo(4));
    println(fibo(5));
    println(fibo(6));
    println(fibo(7));
    println(fibo(8));
    println(fibo(9));
    println(fibo(10));*/
    for (int i = 1; i <= 25; i++) {
        println(fibo(i));
    }
}

int fibo(int n) {
    double y =(1 + Math.sqrt(5)) / 2;
    double z =(1 - Math.sqrt(5)) / 2;
    double x =(Math.pow(y,n) - Math.pow(z,n));
    return (int)(1/Math.sqrt(5)*x);
}
