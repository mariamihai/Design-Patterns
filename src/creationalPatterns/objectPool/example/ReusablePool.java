package creationalPatterns.objectPool.example;

import java.util.ArrayList;
import java.util.List;

public class ReusablePool {

	private static ReusablePool instance = new ReusablePool();
	private static List<Reusable> reusables;
	
	private static int acquiredReusableObjects = 0;	
	private static int maxPoolSize = 1;
	
	private ReusablePool() {
		reusables = new ArrayList<Reusable>();
	}
	
	public static ReusablePool getInstance() {
		return instance;
	}
	
	public void setMaxPoolSize(int maxPoolSize) {
		ReusablePool.maxPoolSize = maxPoolSize;
		
		// Remove additional entries if needed
		if(reusables.size() > maxPoolSize) {
			while(reusables.size() > maxPoolSize) {
				// Not the best idea...
				reusables.remove(0);
			}
		}
	}
	
	public Reusable acquireReusable() throws Exception {
		if (acquiredReusableObjects == maxPoolSize) {
			throw new Exception("Pool limit exceding.");
		}
		
		if (reusables.isEmpty()) {
			return new Reusable(++acquiredReusableObjects);
		}
		
		return reusables.remove(0);
	}
	
	public void releaseReusable(Reusable reusable) {
		if (reusables.size() < ReusablePool.maxPoolSize) {
			reusables.add(reusable);
		}
	}
}
