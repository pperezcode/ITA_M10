package lambdas;

public class Alumne {
		
	public Alumne(String nom, int edat, CursEnum curs, double nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}
	
	private int edat;
	private double nota;
	private String nom;
	private CursEnum curs;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public CursEnum getCurs() {
		return curs;
	}

	public void setCurs(CursEnum curs) {
		this.curs = curs;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "- " + nom + ", " + edat + " anys, " + curs + ", nota: " + nota;
	}

}
