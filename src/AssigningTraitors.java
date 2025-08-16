void main(){
    println("enter number of people");
    Scanner aaron = new Scanner(System.in);
    int t = aaron.nextInt();
    int s = t;
    double tr = t/6.0;
    int tra = (int)Math.round(tr);
    println(tra);
    int i = 1;
    while(i <= s){
        double r = Math.random();
        String role;
        if(r <= (double)tra/t){
            role = "traitor";
            tra--;
            t--;
        }else{
            role = "faithful";
            t--;
        }
        println("player " + i + " is " + role);
        i++;
    }
}
