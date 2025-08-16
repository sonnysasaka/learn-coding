void main() {
    String[] fruits = new String[]{
        "even longer fruit",
        "apple",
        "banana",
        "cherry",
        "date",
        "very long fruit",
        "grape",
        "grapefruit",
        "lemon",
        "ajkdfjsjfdksajkdfjfdsjfdjla",
    };
    String longest;

    longest = "";
    int a = 0;
    while(a<=fruits.length-1) {
        if(fruits[a].length()>longest.length()) {
            longest = fruits[a];
        }
        a++;
    }
    println(longest);
}
