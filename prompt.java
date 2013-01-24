import java.util.Scanner;

public class prompt {
	Scanner in = new Scanner(System.in);
	float number;
	
	public float askG(){
		System.out.println("Please enter Gravitational Constant");
		number = in.nextFloat(); 
		
		if(number > 0.0) {
			return number;
					}
		else{ 
			while(number < 0.0){
		
				System.out.println("Error! Input must be positive.");
				number = in.nextFloat();
			}
			return number;
		}
	}
	public float askM1(){
		System.out.println("Please enter Mass of Object 1");
		number = in.nextFloat(); 
		
		if(number > 0.0) {
			return number;
					}
		else{
			while(number < 0.0){
				
				System.out.println("Error! Input must be positive.");
				number = in.nextFloat();
			}
			return number;
		}
	}
	public float askM2(){	
		System.out.println("Please enter Mass of Object 2");
		number = in.nextFloat(); 
		
		if(number > 0.0) {
			return number;
					}
		else{ 
			while(number < 0.0){
				
				System.out.println("Error! Input must be positive.");
				number = in.nextFloat(); 
			}
			return number;
		}
	}
	public float askR(){
		System.out.println("Please enter the distance between the Two Objects");
		number = in.nextFloat(); 
		
		if(number > 0.0) {
			return number;
					} 
		else{ 
			while(number <= 0){
			
				System.out.println("Error! Input must be non-zero, non-negative."); // negative actually doesnt matter here.
				number = in.nextFloat();
			}	
			return number;
		}
	}
	
}
