
public class frontend {

	public static void main(String args[]){
		calculate c = new calculate();
		prompt p = new prompt();
		
		System.out.println( c.calculateWork(p.askF(), p.askD()) );
	}
}
