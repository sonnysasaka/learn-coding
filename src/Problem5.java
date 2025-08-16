void main(){
    Scanner sc = new Scanner(System.in);
    final double CRICKET_WEIGHT = 0.5; // in grams
    final double PROTEIN_RATIO = 0.6; // or 60%
    print("how MUCH protein do you need?");
    final double PROTEIN_NEED = sc.nextDouble(); // in grams

    

    double nCrickets = PROTEIN_NEED / (PROTEIN_RATIO * CRICKET_WEIGHT);
    println("the bodybuilder needs to eat " + nCrickets + " crickets.");
}
