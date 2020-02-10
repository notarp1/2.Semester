public class Stak_list2 implements IStak {
	private Element start ;

	public Stak_list2(){
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
	
	private class Element {
		private String s;
		private Element next;
		
		private Element(String ind, Element next){
			s = new String (ind); // eller s=ind;
			this.next=next;
		}
	}
}
