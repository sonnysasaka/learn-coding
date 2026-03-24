int width(int n) {
    int w = 0;
    while(n>0) {
        n = n/10;
        w++;
    }
    return w;
}

void main() throws Exception {
    Scanner sc = Tools.scanner;
    println("What is n?!");
    int n = sc.nextInt();
    println("What is k?! ");
    int k = sc.nextInt();
    if (n >= 0 && k >= 0) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= (width(n*j)-width(i*j)); l++) {
                    print(" ");
                }
                print(i*j + " ");
            }
            println();
        }
    } else {
        println("Invalid numbers.");
    }
}
