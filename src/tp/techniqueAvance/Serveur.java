package tp.techniqueAvance;

import java.util.ArrayList;

public class Serveur {
	private static Serveur leServeur;
	private ArrayList<Musicien> orchestre;
	
	private Serveur() {
		orchestre= new ArrayList<Musicien>();
	}
	
	public static Serveur getIntance() {
		if (leServeur==null) {
			leServeur = new Serveur();
		}
		return leServeur;
	}
	
	public void addMusicien(Musicien unMusicien) {
		orchestre.add(unMusicien);
	}
	public void rmMusicien(Musicien unMusicien) {
		orchestre.remove(unMusicien);

	}
	public void addPartition(Partition unePartition) {
		for (Musicien m : orchestre) {
			m.addPartition(unePartition);
			m.notify(unePartition);
		}
	}
	public int getNbMusicien() {
		return orchestre.size();
	}
	public int getNbPartition() {
		return orchestre.get(0).getNbPartition();
	}
	
}
