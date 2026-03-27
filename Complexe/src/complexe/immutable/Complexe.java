package complexe.immutable;

public class Complexe {
	private double re;
	private double im;

	public Complexe(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// getter de "re", permet d'accéder a la valeur de re(réel)
	public double getRe() {
		return re;
	}

	// getter de "im" permet d'accéder a la valeur valeur de im(imaginaire)
	public double getIm() {
		return im;
	}

	public Complexe add(Complexe c) {
		return new Complexe(this.re + c.re, this.im + c.im);
	}

	public Complexe multiply(Complexe c) {
		double real = this.re * c.re - this.im * c.im;
		double imag = this.re * c.im + this.im * c.re;

		return new Complexe(real, imag);
	}

	public Complexe soustr(Complexe c) {
		return new Complexe(this.re - c.re, this.im - c.im);
	}

	public void divis(Complexe c_num, Complexe c_denom) {
		double denom = Math.pow(c_denom.re, 2) + Math.pow(c_num.im, 2);

		if (denom == 0) {
			throw new ArithmeticException("Division par zéro!");
		}

		this.re = (c_num.re * c_denom.re + c_num.im * c_denom.im) / denom;
		this.im = (c_num.re * c_denom.re - c_num.im * c_denom.im) / denom;
	}

	// Representation sous forme de chaine de caractère
	@Override
	public String toString() {
		if (im >= 0) return re + " - " + im + "i";
		else return re + " - " + (-im) + "i";
	}
}
