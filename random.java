import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int max = 2000, min = 500;
		int dormir, n;
	
		for(int i = 0; i < 1000; i++) {
			dormir = rand.nextInt((max - min) + 1)+ min;
			System.out.println(dormir);
		}
		
		for(int i = 0; i < 1000; i++) {
			n = rand.nextInt(3)+ 1;
			System.out.println(n);
		}
	}
}