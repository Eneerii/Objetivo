package principal;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class TestFuture {
	private static int sum;
	public static void main(String[] args) {
		var executor= Executors.newCachedThreadPool();
		Future <Integer> f1=executor.submit(()->5);
		Future <?> f2=executor.submit(()->System.out.println("Hello"));
		Future<Integer> f3=executor.submit(()->sum=IntStream.rangeClosed(1, 10).sum(),sum); 

	}

}
