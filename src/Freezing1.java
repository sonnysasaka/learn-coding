void main(){
    println("enter number of people");
    Scanner aaron = new Scanner(System.in);
    int t = aaron.nextInt();
    int s = t;
    double tr = t/6.0;
    int tra = (int)Math.round(tr);
    println(tra);
    int i = 1;
    int[] players = new int[s];
    while(i <= s){
        double r = Math.random();
        String role;
        if(r <= (double)tra/t){
            role = "traitor";
            tra--;
            t--;
            players[i-1] = 1;
        }else{
            role = "faithful";
            t--;
            players[i-1] = 0;
        }
        println("player " + i + " is " + role);
        i++;
    }
    println("who is being frozen?");
    int m = aaron.nextInt();
    if(players[m-1] == 1) {
        println("YOU CANNOT FREEZE THIS PLAYER!!!!!!!! PLEASE FREEZE AGAIN.");
    } else {
        println("PLAYER " + m + " IS FROZEN");
        players[m-1] = 2;
    }

    println("Situation");
    for (int j = 0; j < s; j++) {
        println("Player " + (j+1) + " is " + players[j]);
    }
}
