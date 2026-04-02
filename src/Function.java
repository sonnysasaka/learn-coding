void say(int x) {
    if (x > 20) {
        return;
    }
    println("hello " + x);
    say(x + 2);
}

long tri(int x) {
    if(x < 1) {
        return 0;
    }
    return tri(x-1) + x;
}

BigInteger fact(BigInteger x) {
    if(x.equals(BigInteger.valueOf(0))) {
        return BigInteger.valueOf(1);
    }
    return fact(x.subtract(BigInteger.valueOf(1))).multiply(x);
}

void main() {
    println(fact(BigInteger.valueOf(9000)));
}
