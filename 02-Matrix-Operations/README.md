# 02 - Matrix Operations Engine

A console-based numerical computation engine built in Java. The application performs fundamental linear algebra operations on 2D arrays (matrices), including matrix addition, subtraction, multiplication, transposition, and scalar scaling, complete with strict dimensional compatibility checks.
*The code does not handle any input other than positive integers for simplicity. The following can be implemented using function readValidInt() which includes exceptions and prompts the user to input again.

---

## Technical Highlights

* **Data Modeling:** Represents mathematical matrices using primitive 2D arrays (`int[][]` / `double[][]`).
* **Dimensional Validation:** Enforces mathematical prerequisites prior to execution (e.g., matching dimensions for addition/subtraction, column-row alignment $A_{\text{cols}} = B_{\text{rows}}$ for multiplication).
* **Nested Iteration Algorithms:** Implements $O(N^3)$ standard matrix multiplication and $O(N^2)$ transposition routines with strict bounds verification.
* **Formatted Output:** Utilizes `System.out.printf` for structured, tabular CLI rendering of 2D data grids.

---

## Usage

### Prerequisites
* Java Development Kit (JDK 17 or higher)
