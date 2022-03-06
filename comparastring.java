import java.util.Scanner;

public class comparastring{
	public static void main(String []args){
		String s1, s2;
		Scanner in = new Scanner(System.in);
		
		System.out.printf("\nS1: ");
		s1 = in.next();
		
		System.out.printf("\nS2: ");
		s2 = in.next();
		
		if(s1.equals(s2)){
			System.out.printf("\nPALAVRAS IGUAIS.");
		}else{
			System.out.printf("\nPALAVRAS DIFERENTES.");
		}
		System.out.println();	
		in.close();
	}
}