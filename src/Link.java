class Node {
    int val;
    Node next;
}
void printChain1(Node n) {
    while (n != null) {
        print(n.val + " ");
        n = n.next;
    }
    println();
}
void printChain2(Node n) {
    if (n != null) {
        print(n.val + " ");
        printChain2(n.next);
    }
}
int sumChain(Node n) {
    if (n == null) return 0;
    return sumChain(n.next) + n.val;
}
void main() {
    Node n = new Node();
    n.val = 10;
    Node m = new Node();
    m.val = 12;
    m.next = n;
    Node o = new Node();
    o.val = 1;
    o.next = m;
    Node p = new Node();
    p.val = -4;
    p.next = o;
    printChain1(p);
    printChain2(p); println();
    println("sum is " + sumChain(p));
}
