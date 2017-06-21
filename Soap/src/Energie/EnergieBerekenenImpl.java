package Energie;

public class EnergieBerekenenImpl implements EnergieBerekenen {

	public String berekenEnergie(int huidig, int standaardEnergie) {
		String energie;
		
		if(huidig > standaardEnergie) {
			energie = "energie overschot";
		}else if(huidig < standaardEnergie) {
			energie = "energie teveel";
		}else {
			energie = "geen idee";
		}
		
		return energie;
	}
}
