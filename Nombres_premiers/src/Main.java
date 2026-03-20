public class Main {
	public static void main(String[] args) {
		int n = 20; // Trouver les nombres premiers jusqu'à 20
		boolean[] premiers = CribleDEratosthene.cribleDEratosthene(n);

		for (int i = 2; i <= n; i++) {
			if (premiers[i]) {
				System.out.print(i + " ");
			}
		}
	}
}