//http://beginnersbook.com/2013/12/how-to-loop-linkedlist-in-java/

import java.util.LinkedList;
public class MyLinkedList extends LinkedList<String> implements IStak {
	private static final long serialVersionUID = -7089479817215565505L;

	public MyLinkedList(){
	super();
	}

	public void vis(){
		while (!tom())
			System.out.println(pop()+" ");
		System.out.println("---");
	} 
	
	public void show(){
	      for(String str: this)
	      	    	  System.out.println(str);
	      System.out.println("---");
	
	} 
	
	public boolean fuld() {
		return false;
	}

	@Override
	public boolean tom() {
		return isEmpty();
	}  
}
