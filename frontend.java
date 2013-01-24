/**
 * A Simple Project : Force of Gravity.
 * Given G, Mass of Object One, Mass of Object 2, and Distance (r) : Return F (Newtons)
 * @author Joseph
 * This project makes little attempt at efficiency, opting instead for a 'quick and dirty' Calculation without being hung up on Design Patterning.
 */
public class frontend{
	
	public static void main(String args[]){
		prompt p = new prompt();
		calculator c = new calculator();
			
		System.out.println( c.toString(c.calculate(p.askG(), p.askM1(), p.askM2(), p.askR() ))); // though this does look like the flywheel :P
		
	}
}
