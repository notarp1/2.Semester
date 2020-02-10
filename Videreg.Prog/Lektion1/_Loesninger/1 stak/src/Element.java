public class Element {
	String s;
	Element next;
	
	Element(String ind, Element next){
		s = new String (ind);
		this.next=next;
	}
}
