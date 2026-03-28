public class Personne {
	private String nom;
	private int age;
	private  String sexe;
	private boolean estDevJava;
	private boolean estEtudiant;

	// Constructeur
	public Personne(String nom, int age, String sexe, boolean estDevJava, boolean estEtudiant) {
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
		this.estDevJava = estDevJava;
		this.estEtudiant = estEtudiant;
	}
	
	public String getNom() { return nom; }
	public int getAge() { return age; }
	public String getSexe() { return sexe; }
	public boolean getEstDevJava() { return estDevJava; }
	public boolean getEstetudiant() { return estEtudiant; }
	
	public boolean estMajeure() { return age >= 18; }
	public void anniversaire() { age++; }

	// sans toString, l'adresse mémoire est affiché
	@Override
	public String toString() {
		return "Personne { " +
				"\n\tnom = '" + nom + "'," +
				"\n\tage = " + age + "," +
				"\n\tsexe: " + sexe + "," +
				"\n\tdéveloppeur(se) JAVA: " + estDevJava + "," +
				"\n\tétudiant(e): " + estEtudiant +
				"\n},\n";
	}
}
