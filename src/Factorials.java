void main() {
    BigInteger x = BigInteger.valueOf(1);
    int y = 1;
    while(y<=10000000) {
        x = x.multiply(BigInteger.valueOf(y));
        y++;
    }
    println(x);
    String s = x.toString();
    println(s.length());
}
