public class Main {
	public static void main(String[] args) {
		int[] vet = {5, 3, 7, 8, 4, 9, 11, 4, 14, 2};
				
		Runnable r1 = () -> {
			int n1 = 0;
			for(int i = 0; i < 5; i++) {
				n1 += vet[i];
			}
			
			System.out.printf("Thread 1: %d\n", n1);
		};
		
		Runnable r2 = () -> {
			int n2 = 0;
			for(int i = 5; i < 10; i++) {
				n2 += vet[i];
			}
			System.out.printf("Thread 2: %d\n", n2);
		};
		
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(r2);
		
		thr1.start();
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("FIM...");
	}
}

