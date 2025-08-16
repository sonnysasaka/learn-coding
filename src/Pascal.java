void printTable(byte n, byte k, long c[][]) {
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= k; j++) {
            print(c[i][j] + " ");
        }
        println();
    }
}

void main() {
    println("What is n?! Range is from 0-64");
    Scanner sc = new Scanner(System.in);
    byte n = sc.nextByte();
    println("What is k?! Range is from 0-64");
    byte k = sc.nextByte();
    byte co = 0;
    byte ro = 0;
    long c[][] = new long [n+1][k+1];
    c [ro][0] = 1;
    while (co<k+1) {
        c [0][co] = 0;
        co++;
    }
    while (ro<n+1) {
        c [ro][0] = 1;
        ro++;
    }
    co = k;
    ro = n;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= k; j++) {
            // fill c[i][j] with the right value
            c [i][j] = c [i-1][j-1] + c [i-1][j];
        }
    }

    // printTable(n, k, c);
    println(c [n][k]);
}
