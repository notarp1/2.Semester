package bmi;

public class Funk implements IFunk {
	private IData data;

	public Funk(IData data){
		this.data = data;
	}
	
	public double getBMI(String cpr) {
		double hoejde = data.getHoejde(cpr);
		double vaegt = data.getVaegt(cpr);
		return  vaegt / (hoejde * hoejde);

	}
	
	public String getTextualBMI(String cpr) {
		double bmi = getBMI(cpr);
		String bmiStr = getNavn(cpr) + " vejer for lidt.";
		if ((bmi >= 18.5) && (bmi < 25))
			bmiStr = getNavn(cpr) + "'s vægt er passende.";
		if ((bmi >= 25) && (bmi <= 30))
			bmiStr = getNavn(cpr) + " er overvægtig.";
		if (bmi > 30)
			bmiStr = getNavn(cpr) + " er svært overvægtig.";
		return bmiStr;
	}
	
	public String getNavn(String cpr) {
		return data.getNavn(cpr);
	}
}
