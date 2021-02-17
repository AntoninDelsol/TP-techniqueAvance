package tp.techniqueAvance;

import java.util.ArrayList;

public class Musicien implements Observer{
	private String nom;
	private String instrument;
	private ArrayList<Partition> lesPartitions = new ArrayList<Partition>();
	
	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public void addPartition(Partition unePartition) {
		this.lesPartitions.add(unePartition);
	}
	public int getNbPartition() {
		return lesPartitions.size();
	}
	public Musicien(String unNom) {
		this.nom=unNom;
	}

	@Override
	public void notify(Partition unePartition) {
		System.out.println("Bonjour "+this.nom +", une nouvelle partition a était ajouté : "+unePartition.getNom());
		
	}
}
