public class Personne {
	private String nom;
	private int age;

	// Constructeur
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public String getNom() { return nom; }
	public int getAge() { return age; }

	public boolean estMajeure() { return age >= 18; }
	public void anniversaire() { age++; }

	// redefintion
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;

		Personne autre = (Personne) obj;

		return age == autre.age && (nom != null ? nom.equals(autre.nom) : autre.nom == null);
	}

	// sans toString, l'adresse mémoire est affiché
	@Override
	public String toString() {
		return "Personne { " + "\n\tnom = '" + nom + "'," + "\n\tage = " + age + ",";
	}
}
