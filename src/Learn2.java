void main() {
    Scanner sc = Tools.scanner;
    println("enter numbers");
    int numsEntered = 0;
    int totalSum = 0;
    int largest = Integer.MIN_VALUE;
    String string = "";
    String string2 = "";
    while (sc.hasNext()) {
        int x = sc.nextInt();
        println("x is " + x);
        numsEntered++;
        string = string + " " + x;
        string2 = x + " " + string2;
        totalSum = totalSum + x;
        if(largest<x) {
            largest = x;
        }
    }
    println("numbers entered: " + numsEntered);
    println("total sum: " + totalSum);
    println("average: " + (double)totalSum/numsEntered);
    println("largest number: " + largest);
    println("numbers: " + string);
    println("reversed numbers: " + string2);
}
