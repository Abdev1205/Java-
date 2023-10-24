public class MazeAlgorithm {
  static final int n = 7;
  static int[] rowPositions = new int[n];

  // check if a queen can be placed in given row and column
  static boolean isSafe(int row, int col) {
    for (int i = 0; i < row; i++) {
      // Check if there is a queen in the same column or diagonals
      if (
        rowPositions[i] == col ||
        Math.abs(row - i) == Math.abs(col - rowPositions[i])
      ) {
        return false;
      }
    }
    return true;
  }

  // Recursive backtracking to find a solution
  static boolean solveQueens(int row) {
    if (row == n) {
      // All queens are placed, printing the solution
      printSolution();
      return true;
    }

    for (int col = 0; col < n; col++) {
      // Try placing the queen at this column
      rowPositions[row] = col;

      // If the queen can be placed safely, recursively solve for the next row
      if (isSafe(row, col)) {
        if (solveQueens(row + 1)) {
          return true;
        }
      }
    }

    // If the queen cannot be placed safely in any of the columns, return false
    return false;
  }

  // Printing the chessboard with the queens' positions
  static void printSolution() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (rowPositions[i] == j) {
          System.out.print("Q ");
        } else {
          System.out.print(". ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    if (solveQueens(0)) {
      System.out.println("One solution found.");
    } else {
      System.out.println("No solution found.");
    }
  }
}
