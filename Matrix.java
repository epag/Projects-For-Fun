public class Matrix {
	public void random(String[][] board) {
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				if (Math.random() < .7)
					board[a][b] = " ";
				else if (Math.random() > .71 && Math.random() < .85)
					board[a][b] = "1";
				else
					board[a][b] = "0";
				System.out.printf("%2s", board[a][b]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		String[][] gameBoard = new String[100][100];
		Matrix g = new Matrix();
		for (int i = 0; i > -1; i++) {
			g.random(gameBoard);
			try {
			    Thread.sleep(0);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	}
}
