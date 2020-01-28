package creationalPatterns.objectPool.example;

public class Client {

	public static void main(String[] args) throws Exception {
		ReusablePool pool = ReusablePool.getInstance();
		pool.setMaxPoolSize(3);
		
		Reusable reusable1 = pool.acquireReusable();
		System.out.println(reusable1);
		Reusable reusable2 = pool.acquireReusable();
		System.out.println(reusable2);
		
		pool.releaseReusable(reusable2);
		
		Reusable reusable3 = pool.acquireReusable();
		System.out.println(reusable3);
		
	}
}
