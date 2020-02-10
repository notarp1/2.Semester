public class Stak_tabel implements IStak {
	private String data[];
	private int stakTop;
	private int antal;
	
	public Stak_tabel(int n){
		antal = n;
		data = new String[antal];
		stakTop = -1;
	}
	
	public void push(String v){
		data [++stakTop] = v;
	}
	
	public String pop() {
		return data [stakTop--];
	}
	
	public boolean tom(){
		return stakTop == -1;
	}
	
	public boolean fuld() {
		return (stakTop == antal - 1);
	}
	
	public void vis() {
		while (!tom())
			System.out.println(pop()+" ");
			System.out.println("---");
	}
	
	public void show() {
		for (int i = stakTop; i>-1; i--)
			System.out.println(data[i]+" ");
			System.out.println("---");
	}
}
