package behavioralPatterns.strategyPattern.operationsExample;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Strategy strategyAdd = new OperationAdd();
		Strategy strategySubstract = new OperationSubstract();
		Strategy strategyMultiply = new OperationMultiply();
		
		Context c1 = new Context(strategyAdd);
		System.out.println(c1.executeStrategy(1, 2));
		Context c2 = new Context(strategySubstract);
		System.out.println(c2.executeStrategy(1, 2));
		Context c3 = new Context(strategyMultiply);
		System.out.println(c3.executeStrategy(1, 2));
	}

}
