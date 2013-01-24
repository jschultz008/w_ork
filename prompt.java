import java.util.*;

public class prompt {
	
	Scanner in = new Scanner(System.in);
	float number;
	
	public float askF(){
		do {
		System.out.println("Please enter [Positive] Force: ");
		number = in.nextFloat();
		
		
		}while(number <= 0.0);
		
		return number;
	}
	
	public float askD(){
		do {
		System.out.println("Please enter a [Positive] Distance: ");
		number = in.nextFloat();
		
		
		}while(number <= 0.0);
		
		return number;
	}
}
