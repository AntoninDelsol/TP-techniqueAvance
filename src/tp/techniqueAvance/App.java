package tp.techniqueAvance;

public class App {

	public static void main(String[] args) {
		
		Musicien m1 = FactoryMusicien.createMusicien("pianoBoss", 0);
		Musicien m2 = FactoryMusicien.createMusicien("volonBoss", 1);
		Musicien m3 = FactoryMusicien.createMusicien("TrompeBoss", 2);
		
		Serveur serv = Serveur.getIntance();
		serv.addMusicien(m1);
		serv.addMusicien(m2);
		serv.addMusicien(m3);
		
		Partition part1 = new Partition("part1", 'A');
		Partition part2 = new Partition("part2", 'B');

		serv.addPartition(part1);
		serv.addPartition(part2);
	}

}
