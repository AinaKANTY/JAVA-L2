public class Etudiant extends Personne {
	private String classe;

	// constructeur
	public Etudiant(String nom, int age, String classe) {
		super(nom, age);
		this.classe = classe;
	}

	// réimlplémentation de la methode equals
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;

		Etudiant autre = (Etudiant) obj;

		return classe != null ? classe.equals(autre.classe) : autre.classe == null;
	}

	// getter de classe
	public String getClasse() { return classe; }

	// utilise "super" pour accéder au methode "toString"
	@Override
	public String toString() {
		return super.toString() + "\n\tclasse = " + classe + "\n},\n";
	}
}