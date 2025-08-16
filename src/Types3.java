void main() {
    long j = 9000000000000000000L;
    while (j > 0) {
        if (j % 1000000000 == 0) {
            System.out.println(j);
        }
        j++;
    }

     System.out.println(Long.MAX_VALUE);
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Short.MAX_VALUE);
     System.out.println(Byte.MAX_VALUE);
     System.out.println(Long.MIN_VALUE);
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Short.MIN_VALUE);
     System.out.println(Byte.MIN_VALUE);

    double x = 5;
    println(x / 3);
}
