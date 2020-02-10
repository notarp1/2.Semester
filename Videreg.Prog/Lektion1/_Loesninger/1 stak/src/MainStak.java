

//import java.util.LinkedList__;
public class MainStak {
	public static Stak_tabel opretStak (int n){
		return new Stak_tabel(n);
	}

	public static void main(String[] args)
	{
		//Stak_tabel s = opretStak (10);
		Stak_list s = new Stak_list ();
		//Stak_list2 s = new Stak_list2 (); 
		//MyLinkedList s = new MyLinkedList();
		s.push("Dette");
		s.push("er");
		s.push("ene");
		s.show();
		s.push("mærkelig");
		s.push("sætning");
		//s.pop();
		s.vis();
		s.show();
		//		
//		System.out.println(s.pop());
//		System.out.println("");
//		
//		s.vis();
//		while (!s.tom())
//			System.out.println(s.pop());
//		System.out.println("****");
//		
//		s.vis();
	}
}
