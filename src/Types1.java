import static java.lang.System.out;

void main() {
    int x = 2000000000;
    int b = 0;
    while (x > 0) {
        if (x % 100 == 0)
            out.println(x);
        b = x;
        x++;
    }
    out.println(b);
}
