package recursiva;

public class R0 {

	public static void main(String[] args) {
		System.out.println(seqCalc(100));
		
		
	}
	
	public static int seqCalc(int num) {	
		if(num == 1) {
			return num;
		}else {			
			return   num + seqCalc(num -1);
		}
		
	}
	
	

}
