# 01 - Number Guessing Game

A console-based number guessing game built in Java. The application generates a target number within a specified range, processes user guesses via the command line, delivers directional feedback (`Too High` / `Too Low`), and tracks total attempts until the target is found.

---

## Technical Highlights

* **Input Processing:** Handles terminal input using `java.util.Scanner` with defensive checks against non-integer entries.
* **Flow Control:** Utilizes `while` loops for continuous game state execution and conditional branching (`if-else`) for evaluation logic.
* **Pseudorandom Generation:** Uses `java.util.Random` for bounded integer generation.
* **State Tracking:** Tracks attempt counters and session statistics across replay cycles.

---

## Usage

### Tools

* Java Development Kit (JDK 17 or higher)

### Build and Run

```bash
cd 01-number-guessing-game/src

javac Main.java

java Main
