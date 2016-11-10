
public class Zahlentests {
	
	private static Zahlengenerator zahlentest1;

	public static void main(String[] args) {
		setZahlentest1(new Zahlengenerator(17));
		zahlentest1.getZahl();
	}

	public static Zahlengenerator getZahlentest1() {
		return zahlentest1;
	}

	public static void setZahlentest1(Zahlengenerator zahlentest1) {
		Zahlentests.zahlentest1 = zahlentest1;
	}
	
}
