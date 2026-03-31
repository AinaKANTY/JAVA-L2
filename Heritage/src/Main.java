public class Main {
	public void main(String[] args) {
		Etudiant e1 = new Etudiant("Bob", 22, "L2 Informatique");
		Etudiant e2 = new Etudiant("Bob", 22, "L2 Informatique");
		Etudiant e3 = new Etudiant("Doe", 22, "M1 Informatique");

		IO.println("e1.equals(e2): " + e1.equals(e2));
		IO.println("e1.equals(e3): " + e1.equals(e3));
		IO.println("e1: " + e1);
	}
}