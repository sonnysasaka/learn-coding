void main() throws Exception {
    Scanner sc = Tools.scanner;
    print("how long in minutes ");
    int h = sc.nextInt();
    int k = h;
    for (int j = h * 60; j >= 0; j--) {
        String d = k + ":" + j % 60;
        if (j % 60 < 10) {
            d = k + ":" + "0" + j % 60;
        }
        println(d + " remaining");
        Thread.sleep(1000);

        if (j % 60 == 0) {
            k--;
        }
    }
    Tools.ring();
}

