
public class VerucaSalt {	
	public static void main(String[] args) {
		System.out.println("Winning spot is: " + takeGifts(4120682));
	}
	
	/** Returns the spot Veruca should sit in to be the winner*/
	public static int takeGifts(int circleSize){
		
		// 4120682 decimal = 1111101110000001101010 binary
		String str = Integer.toBinaryString(circleSize);  
        
		// performs circularLeftShift --> 1111011100000011010101
		str = str.substring(1) + str.charAt(0);     		
        return Integer.parseInt(str, 2); 
	}
	
}
