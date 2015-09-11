public class FluidDynamics {
	int D = 8;
	String[][] board = new String[100][100];
	int x = 50;
	int y = 50;

	public FluidDynamics(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String[][] setStart() {
		if (8==D) {
			for (int a = 0; a < 100; a++) {
				for (int b = 0; b < 100; b++) {
					if (a != x || b != y)
						board[a][b] = " ";
					else
						board[a][b] = "*";
				}
			}
		}
		return board;
	}

	public boolean checkStar(int a, int b) {
		boolean yes = false;
		if (board[a][b].toString().equals("*"))
			yes = true;
		return yes;
	}

	public String[][] getWaves() {
				String[][] nextBoard = new String[100][100];
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				nextBoard[a][b] = " ";
			}
			}
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				try {
					if (checkStar(a, b)) {
						nextBoard[a+1][b] = "*";
						nextBoard[a+1][b+1] = "*";
						nextBoard[a+1][b-1] = "*";
						nextBoard[a-1][b] = "*";
						nextBoard[a-1][b+1] = "*";
						nextBoard[a-1][b-1] = "*";
						nextBoard[a][b+1] = "*";
						nextBoard[a][b-1] = "*";
						nextBoard[a][b] = " ";
					}
				} catch (ArrayIndexOutOfBoundsException asd) {

				}
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				board[i][j] = nextBoard[i][j];
			}
		}
		return board;
	}

	void print() {
		for (int z = 0; z < 100; z++) {
			for (int q = 0; q < 100; q++) {
				System.out.print(board[z][q]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	public static void main(String[] args) {
		FluidDynamics f = new FluidDynamics(50, 50);
		f.setStart();
		f.print();
		int doit = 0;
		while (doit < 25){
		f.getWaves();
		f.print();
		doit++;
		}
	}
}
