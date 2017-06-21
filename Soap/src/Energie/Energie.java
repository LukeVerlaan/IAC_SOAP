package Energie;

public class Energie {
	private int huidigEnergie;
	private int standaardEnergie;
	
	public Energie(int h, int s) {
		huidigEnergie= h;
		standaardEnergie = s;
	}
	
	public int getHuidig() {
		return huidigEnergie;
	}
	
	public int getStandaardEnergie() {
		return standaardEnergie;
	}
	
	public void setKWH(int h) {
		huidigEnergie = h;
	}
	
	public void setStandaardEnergie(int s) {
		standaardEnergie = s;
	}
}
