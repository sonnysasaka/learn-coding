void main() {
    int v = 0;
    for (short j = 1; j < 2000; j++) {
        if (j % 11 == 0 && j % 13 == 0) {
            continue;
        }

        if (j % 11 == 0) {
            v = v + j;
        } else if (j % 13 == 0) {
            v = v + j;
        }
    }
    println(v);
}
