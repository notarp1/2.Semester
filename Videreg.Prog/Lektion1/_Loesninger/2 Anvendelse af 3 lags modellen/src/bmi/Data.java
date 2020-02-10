package bmi;
import java.util.*;



public class Data implements IData
{
	private class Person {
		String cpr;
		String navn;
		double hoejde;
		double vaegt;
		public Person(String cpr, String navn, double hoejde, double vaegt) {
			super();
			this.cpr = cpr;
			this.navn = navn;
			this.hoejde = hoejde;
			this.vaegt = vaegt;
		}

		public String toString(){
			return cpr + " " + navn;
		}
	}
	
	private ArrayList<Person> personer;
	
	public Data(){
		personer = new ArrayList<Person>();
		// Tilføj personer 
		personer.add(new Person("123456-1234", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
		personer.add(new Person("111111-1111", "Peter Jensen", 1.95, 55.0));
		personer.add(new Person("222222-2222", "Albert Svanesen", 1.65, 65.0));
		personer.add(new Person("333333-3333", "Oskar Petersen", 1.65, 75.0));
		personer.add(new Person("444444-4444", "Hans Olsen", 1.70, 170.0));
		// print dem lige ud af hensyn til debug
		Iterator<Person> it =  personer.iterator();
        while(it.hasNext()) 
        System.out.println(it.next());
        System.out.println("---");
	}
	
	//Returner personens navn
	public String getNavn(String cpr){
		for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
		return personer.get(i).navn;
		return null;
	}
	
	//Returner personens vægt
	public double getVaegt(String cpr){
		for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
		return personer.get(i).vaegt;
		return -1;
	}
	//Returner personens højde
	public double getHoejde(String cpr){
		for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
		return personer.get(i).hoejde;
		return -1;
	}
}