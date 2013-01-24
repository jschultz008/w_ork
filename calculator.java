
public class calculator {
	public float calculate( float g, 
			              float m1, float m2, 
			              float r){
		
		return ((g * m1 * m2) / (r * r)); // "F"
	}
	
	public String toString(float F){
		return "Gravitational Force equal to: "+ F + "N";
	}
}
