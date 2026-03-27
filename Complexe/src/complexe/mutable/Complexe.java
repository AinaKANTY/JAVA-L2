package complexe.mutable;

public class Complexe {
	private double re;
	private double im;

	public Complexe(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// getter du réel
	public double getRe() {
		return re;
	}

	// le setter "setRe" permet de modifier la valeur du réer
	public void setRe(double re) {
		this.re = re;
	}

	// getter de l'imaginaire
	public double getIm() {
		return im;
	}

	// le setter "setIm" permet de modifier la valeur de l'imaginaire
	public void setIm(double im) {
		this.im = im;
	}

	public void add(Complexe c) {
		this.re += c.re;
		this.im += c.im;
	}

	public void multiply(Complexe c) {
		double tempRe = this.re * c.re - this.im * c.im;
		double tempIm = this.re * c.im + this.im * c.re;

		this.re = tempRe;
		this.im = tempIm;
	}

	public void soustr(Complexe c) {
		this.re -= c.re;
		this.im -= c.im;
	}

	public void divis(Complexe c_num, Complexe c_denom) {
		double denom = Math.pow(c_denom.re, 2) + Math.pow(c_num.im, 2);

		if (denom == 0) {
			throw new ArithmeticException("Division par zéro!");
		}

		this.re = (c_num.re * c_denom.re + c_num.im * c_denom.im) / denom;
		this.re = (c_num.re * c_denom.re - c_num.im * c_denom.im) / denom;
	}

	@Override
	public String toString() {
		if (im >= 0) return re + " - " + im + "i";
		else return re + " - " + (-im) + "i";
	}
}