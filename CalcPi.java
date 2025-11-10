// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int lim = Integer.parseInt(args[0]);
		double pi = 1;
		boolean mp = false;
		for(double i = 3; i<=lim*2; i+=2 ){
			if(mp == false){
				pi = pi -1.0/i;
				mp = true;
			}
			else{
				pi = pi + 1.0/i;
				mp = false;
			}
		}

	
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pi*4);
	}
	
}
