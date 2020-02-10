  //http://www.sanfoundry.com/java-program-implement-singly-linked-list/

  public class Stak_list implements IStak {
	Element start ;

	public Stak_list(){
		start = null;
	}
	
	@Override
	public void push(String v) {
		if (start == null)
			start = new Element(v,null);
		else 
			start = new Element(v,start);
	}

	@Override
	public String pop() {
		String out = start.s;
		start = start.next; 
		return out;
	}

	public boolean tom() {
		return (start == null);
	}

	@Override
	public boolean fuld() {
		return false;
	}

	@Override
	public void vis() {
		while (!tom())
			System.out.println(pop()+" ");
		System.out.println("---");
	} 
	
	public void show() {
		if (start == null){
			System.out.println("---");
			return;
		}
		Element temp = start;
		while (temp.next != null){
			System.out.println(temp.s);
			temp=temp.next;
		}	
		System.out.println(temp.s);
		System.out.println("---");
	}
}
