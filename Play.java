/**
 * 
 * @author Evan Pagryzinski
 * @date 13/10/14
 *
 */
public class Play {
	String[][] board = new String[50][100];

	public String[][] random() {
		for (int a = 0; a < 50; a++) {
			for (int b = 0; b < 100; b++) {
				if (Math.random() < .90)
					board[a][b] = " ";
				else
					board[a][b] = "*";
				System.out.printf(board[a][b]);
			}
			System.out.println("");
		}
		return board;
	}

	public int checker(int i, int j, String[][] board) {
		int counter = 0;
		if (i > 0) {
			if (board[i - 1][j].toString().equals("*"))
				counter++;
			if (j > 0)
				if (board[i - 1][j - 1].toString().equals("*"))
					counter++;
			if (j < 99)
				if (board[i - 1][j + 1].toString().equals("*"))
					counter++;
		}
		if (j > 0)
			if (board[i][j - 1].toString().equals("*"))
				counter++;
		if (j < 99)
			if (board[i][j + 1].toString().equals("*"))
				counter++;
		if (i < 49) {
			if (board[i + 1][j].toString().equals("*"))
				counter++;
			if (j > 0)
				if (board[i + 1][j - 1].toString().equals("*"))
					counter++;
			if (j < 99)
				if (board[i + 1][j + 1].toString().equals("*"))
					counter++;
		}
		return counter;
	}

	public String[][] nextBoard() {
		String[][] nextBoard = new String[50][100];
		for (int a = 0; a < 50; a++) {
			for (int b = 0; b < 100; b++) {
				if (checker(a, b, board) < 2)
					nextBoard[a][b] = " ";
				if (checker(a, b, board) > 3)
					nextBoard[a][b] = " ";
				if (checker(a, b, board) == 2){
					if (board[a][b].toString().equals("*"))
						nextBoard[a][b] = "*";
					else
					nextBoard[a][b] = " ";
				}
				if (checker(a, b, board) == 3)
					nextBoard[a][b] = "*";
				System.out.print(nextBoard[a][b]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < nextBoard.length; i++)
			for (int j = 0; j < nextBoard[i].length; j++)
				board[i][j] = nextBoard[i][j];
		return board;
	}

	public static void main(String[] args) {
		Play p = new Play();
		p.random();
		while (true) {
			p.nextBoard();
			try {
				Thread.sleep(500); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
