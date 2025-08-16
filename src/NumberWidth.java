int width(int n) {
    int w = 0;
    while(n>0) {
        n = n/10;
        w++;
    }
    return w;
}

void main() {
    println(width(3));
    println(width(204));
    for (int i = 0; i < width(2000); i++) {
        print("_");
    }
    println();
    // print _ digit times
    // for(int i = 1; i <= w+1; i++) {
    //     print("_");
    // }
    // println();
}
