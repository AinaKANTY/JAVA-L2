import complexe.mutable.Complexe;
// import complexe.immutable.Complexe;

public class Main {
	public static void main(String[] args) {
		Complexe z1, z2, z3;
		z1 = new Complexe(1.0, 1.0);
		z2 = new Complexe(1.0, - 1.0);
		z3 = z2;

		z2.add(z3);
		// z2.add(z1);
		// z2.multiply(z1);
		// z2.soustr(z1);
		// z2.divis(z1, z2);

		// IO.println(z1);
		IO.println(z2);
		// IO.println(z3);
	}
}