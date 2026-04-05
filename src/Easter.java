/*
 * === Easter Egg Hunt ===
 *
 * Somewhere hidden is a secret keyword.
 * Your mission: find the String that unlocks the puzzle!
 *
 * Call Puzzle.unlock(keyword) with your guess.
 * It returns true if you found it, false otherwise.
 *
 * Trying some guesses by hand:
 *   Puzzle.unlock("abc") -> false
 *   Puzzle.unlock("egg") -> false
 *   Puzzle.unlock("dog") -> false
 *   Puzzle.unlock("sun") -> false
 *
 * As you can see, guessing by hand is going to take forever...
 *
 * Hint: the keyword is exactly 3 lowercase letters (a-z).
 */
void main() {
    println(Puzzle.unlock("abc")); // should print false
    println(Puzzle.unlock("cat")); // should print false
    println(Puzzle.unlock("xyz")); // should print false
    // But what is the right word to unlock (that returns true)?
    // Use your coding power to find it!
}
