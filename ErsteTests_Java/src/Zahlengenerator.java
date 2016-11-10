
public class Zahlengenerator {
private int zahl;

public Zahlengenerator (int zahl)
{
	this.zahl=zahl;
}

public int getZahl() {
	return zahl;
}

public void setZahl(int zahl) {
	zahl = zahl*10;
	
}

}
