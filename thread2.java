import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		int[] vet = {5, 3, 7, 8, 4, 9, 11, 4, 14, 2};
	
		Callable<Integer> tarefa = () -> {
			Random rand = new Random();
			int acc = 0;
			for(int i = 0; i < 10000; i++) {
				acc += rand.nextInt(100);
			}
			return acc;
		};
		
		//Exercícios básicos
		Callable<Integer> t1 = () -> {
			int n1 = 0;
			for(int i = 0; i < 5; i++) {
				n1 += vet[i];
			}
			return n1;
		};
		
		Callable<Integer> t2 = () -> {
			int n2 = 0;
			for(int i = 5; i < 10; i++) {
				n2 += vet[i];
			}
			return n2;
		};
		
		ExecutorService threadPool = Executors.newFixedThreadPool(2); // () número máximo de threads
		Future<Integer> v1 = threadPool.submit(t1);
		Future<Integer> v2 = threadPool.submit(t2);
		
		int retorno = v1.get() + v2.get();
		
		System.out.println("Essa Soma 2 threads: "+ retorno);
		
		threadPool.shutdown();
		
		Callable<Integer> tarefa1 = () -> {
			int n1 = 0;
			for(int i = 0; i < 2; i++) {
				n1 += vet[i];
			}
			return n1;
		};
		
		Callable<Integer> tarefa2 = () -> {
			int n2 = 0;
			for(int i = 2; i < 5; i++) {
				n2 += vet[i];
			}
			return n2;
		};
		
		Callable<Integer> tarefa3 = () -> {
			int n3 = 0;
			for(int i = 5; i < 7; i++) {
				n3 += vet[i];
			}
			return n3;
		};
		
		Callable<Integer> tarefa4 = () -> {
			int n4 = 0;
			for(int i = 7; i < 10; i++) {
				n4 += vet[i];
			}
			return n4;
		};
		
		ExecutorService threadPool1 = Executors.newFixedThreadPool(4);
		Future<Integer> valor1 = threadPool1.submit(tarefa1);
		Future<Integer> valor2 = threadPool1.submit(tarefa2);
		Future<Integer> valor3 = threadPool1.submit(tarefa3);
		Future<Integer> valor4 = threadPool1.submit(tarefa4);
		
		int retorno1 = valor1.get() + valor2.get() + valor3.get() + valor4.get();
		
		System.out.println("Essa Soma 4 threads: "+ retorno1);
		
		threadPool1.shutdown();
		
		//cria o pool de threads
		ExecutorService threadPool0 = Executors.newFixedThreadPool(4);
		Future<Integer> retorno0    = threadPool0.submit(tarefa);
		
		while(!retorno0.isDone()) {
			System.out.println("A tarefa ainda não concluida...");
		}
		
		int resultado = 0;
		System.out.println("Tarefa completa!");
		
		try {
			resultado = retorno0.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("O resultado é: "+ resultado);
		threadPool0.shutdown();
		
		int nucleos = Runtime.getRuntime().availableProcessors();
		System.out.println("Núcleos PC: "+ nucleos);
	}
}