void main() {
    int numbers [] = {6543,645,654,657,7765,5647,543,76,876,87};
    // int winner = numbers[0];
    // for(int b = 0; b<=numbers.length-1; b++) {
    //     if(numbers[b]>winner) {
    //         winner = numbers[b];
    //     }
    // }
    // println("The smallest number is:"+winner);
    // int wing = numbers[0];
    // for(int b = 0; b<=numbers.length-1; b++) {
    //     if(numbers[b]<wing) {
    //         wing = numbers[b];
    //     }
    // }
    // println("The smallest number is:"+wing);
    int fsd = numbers[0];
    boolean sorted = false;
    for(int sort = 0;sort < numbers.length; sort++) {
        for(int i = 0;i < numbers.length-1; i++) {
            if(numbers[i]>numbers[i+1]) {
                int b = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = b;
            }
        }
    }
    for(int i = 0; i<=numbers.length-1; i++) {
        println(numbers[i]);
    }
    println();
}
