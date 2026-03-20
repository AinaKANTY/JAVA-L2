import java.util.Arrays;

public class CribleDEratosthene {
	public static boolean[] cribleDEratosthene(int n) {
		boolean[] premiers = new boolean[n + 1];
		Arrays.fill(premiers, true);
		premiers[0] = false;
		premiers[1] = false;

		for (int p = 2; p * p <= n; p++) {
			if (premiers[p]) {
				for (int i = p * p; i <= n; i += p) {
					premiers[i] = false;
				}
			}
		}
		return premiers;
	}
}
