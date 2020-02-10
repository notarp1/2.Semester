/*
C:\Users\shog\Google Drive\DTU\# 02324\_02324 Tilgængeligt på CN\Lektion 02\Opgaver\02_bmi.zip
*/
package bmi;
public class Main {
	public static void main(String[] args) {
//		IData d = new Data(); 					// implementering af IData
//		IFunk f = new Funk(d); 					// implementering af IFunk
//		Tui g = new Tui(f);
//		g.dialog();
		
		new Tui(new Funk(new Data())).dialog();
	}
}
