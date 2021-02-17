package tp.techniqueAvance;

public class Partition {
	private String nom;
	private char tonalite;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getTonalite() {
		return tonalite;
	}

	public void setTonalite(char tonalite) {
		this.tonalite = tonalite;
	}

	public Partition(String nom, char tonalite) {
		this.nom = nom;
		this.tonalite = tonalite;
	}
	
	
}
