long gcf(long a, long b) {
    if(a%b == 0) {
        return b;
    } else {
        return gcf(b, a%b);
    }
}
void main() {
    println(gcf(65536,40960));
}
