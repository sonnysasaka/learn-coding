/*
 * Problem: Lattice Flowers
 *
 * Goma was busy picking flowers for Peach when he discovered a patch of flowers
 * in the form of an N x M lattice with one flower per point. Starting from point
 * (1,1) of the lattice, Goma will walk in a straight line picking up all flowers
 * in the points he passes through (including (1,1)). He wants to find a path to
 * maximize the number of flowers he picks, and he also wants to know the number
 * of ways to walk that will maximize the number of flowers he picks up.
 * Your task: Implement the function solve(int n, int m) which prints two
 * integers on a single line:
 *   a  - the maximum number of flowers Goma can pick starting from (1,1)
 *   b  - the number of unique straight-line directions that achieve that maximum
 * Constraints:
 *   2 <= N, M <= 1000
 * Example:
 *   Input:  n=2, m=2  ->  Output: "2 3"
 *   Input:  n=3, m=2  ->  Output: "3 1"
 * Explanation:
 *   For n=2, m=2: Goma can pick 2 flowers at most, and can walk from (1,1) to (2,1),
 *   from (1,1) to (2,2), or from (1,1) to (1,2) -- three unique paths.
 *   For n=3, m=2: Goma can only pick 3 flowers at best, walking from (1,1) to (3,1)
 *   -- only one such path exists.
 */
void solve(int n, int m) {
    if(n > m) {
        println(n + " " + 1);
    } else if(n < m) {
        println(m + " " + 1);
    } else {
        println(n + " " + 3);
    }
}
void main() {
    // Sample test cases from the original problem
    solve(2, 2);  // Expected output: 2 3
    solve(3, 2);  // Expected output: 3 1
    // Additional test cases, uncomment when ready to test
    solve(2, 3);
    solve(4, 4);
    solve(7, 1000);
    solve(1000, 1000);
}
