/**
 * @author Evan Pagryzinski
 * @date 10/10/14
 */
import java.util.Random;
public class Maker {
	private static String password = "";
	private static String choice = "abcdefghijklmnopqrstuvwxyz1234567890`~!@#$%^&*()_-=+|[]}{':;,./?><ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678";
	static String[][] digets = new String[10][10];
	String name = "";
	String pass = "";
	Random random;
	long sum = 0;
	public Maker(String name) {
		this.random = new Random((long) (seed(name) * Math.pow(4.329, 20)));
		this.name = name;
		this.pass = passwordMaker();
	}
	private long seed(String nam) {
		long sum = 0;
		for (int a = 0; a < nam.length(); a ++) {
			sum += nam.charAt(a);
		}
		return sum;
	}
	private String passwordMaker() {
		password = "";
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {
				int r = (int) (random.nextInt(100));
				digets[row][column] = choice.substring(r, r + 1);
			}
		}

		for (int x = 0; x < 10; x++) {
			int a = (int) (random.nextInt(10));
			int b = (int) (random.nextInt(10));
			password += digets[a][b];
		}
		return password;
	}
	private void printData() {
		System.out.println(name);
		System.out.println(pass);
	}

	public static void main(String[] args) {
		Maker p1 = new Maker("facebook");
		Maker p2 = new Maker("youtube");
		Maker p3 = new Maker("hulu");
		Maker p4 = new Maker("Purdue");
		p1.printData();
		p2.printData();
		p3.printData();
		p4.printData();
	}
}
