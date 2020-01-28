package behavioralPatterns.strategyPattern.operationsExample;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int a, int b) {
		return this.strategy.doOperation(a, b);
	}
	
}
