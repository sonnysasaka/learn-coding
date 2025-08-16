void main() {
    Scanner sc = new Scanner(System.in);
    int min = 1;
    int max = Integer.MAX_VALUE-1;

    int guess = 0;
    while (true) {
        if(min == max){
            println("I  know  your  number  ,  it  is  " + min);
            break;
        }
        guess = (min + max)/2;
        print("Is your number " + guess + "? ");
        String answer = sc.nextLine();
        if (answer.charAt(0) == 'h') {
            max = guess - 1;
        } else if (answer.charAt(0) == 'l') {
            min = guess + 1;
        } else if (answer.charAt(0) == 'c') {
            println("I win, your number is " + guess);
            break;
        }
    }
}
