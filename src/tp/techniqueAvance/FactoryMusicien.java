package tp.techniqueAvance;

public class FactoryMusicien {
	private static final int piano =0;
	private static final int violon =1;
	private static final int trompette=2;
	
	public static Musicien createMusicien(String unNom, int typeInstrument) {
		switch (typeInstrument) {
		case piano :
			return new Pianiste(unNom);
		case violon:
			return new Violoniste(unNom);
		case trompette:
			return new Trompettiste(unNom);
		default:
			return null;
		
		}
	}
}
