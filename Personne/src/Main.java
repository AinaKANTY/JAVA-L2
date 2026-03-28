public class Main {
	public static void main(String[] args) {
		Personne p1 = new Personne("Alice", 21, "F", true, true);
		Personne p2 = new Personne(new String("Alice"), 20, "F", true, false);
		Personne p3 = p1;

		IO.println("p1: " + p1);
		IO.println("p2: " + p2);
		IO.println("p3: " + p3);

		// Comparaison des référenes objets
		IO.println("\nComparaison des objets avec '==':" );
		IO.println("p1 == p2: " + (p1 == p2));
		IO.println("p1 == p3: " + (p1 == p3));

		IO.println("\nComparaison des objets avec 'equals()':" );
		IO.println("p1.equals(p2): " + p1.equals(p2));
		IO.println("p1.equals(p3): " + p1.equals(p3));

		// Comparaison des attribus
		IO.println("\nComparaison des noms:");
		// == compare les attributs
		IO.println("p1.getNom() == p2.getNom(): " + (p1.getNom() == p2.getNom()));
		// equals() compare les objets
		IO.println("p1.getNom().equals(p2.getNom()): " + p1.getNom().equals(p2.getNom()));
	}
}