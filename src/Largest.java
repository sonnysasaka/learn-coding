void main() {
    int[] nums = new int[]{3, 4, -23, -2333, 49, 2, 900, 32, 3, 2332};

    println(nums.length);

    int b = 0;
    int winner = nums[b];
    while(b<=(nums.length-1)) {
        if(nums[b]>winner) {
            winner = nums[b];
        }

        b++;
    }
    println("The smallest number is:"+winner);
}
