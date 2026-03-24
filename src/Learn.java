void main() {
    Scanner sc = Tools.scanner;
    int numsEntered = 0;
    int totalSum = 0;
    int largest = Integer.MIN_VALUE;
    while (sc.hasNext()) {
        int x = sc.nextInt();
        println("x is " + x);
        numsEntered++;
        totalSum = totalSum + x;
        if(largest<x) {
            largest = x;
        }
    }
    
    println("numbers entered: " + numsEntered);
    println("total sum: " + totalSum);
    println("average: " + (double)totalSum/numsEntered);
    println("largest number: " + largest);
}
