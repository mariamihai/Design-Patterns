package structuralPatterns.compositePattern.employeesExample;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee bigBoss = new Employee("Name 1", "Dept 1", 10000);
		Employee smallerBoss1 = new Employee("Name 2", "Dept 1", 9000);
		Employee employee1 = new Employee("Name 3", "Dept 1", 8000);
		bigBoss.add(smallerBoss1);
		smallerBoss1.add(employee1);
		
		System.out.println(bigBoss);
		System.out.println(smallerBoss1);
		System.out.println(employee1);
		

		Employee smallerBoss2 = new Employee("Name 4", "Dept 2", 9000);
		Employee employee2 = new Employee("Name 5", "Dept 2", 7000);
		bigBoss.add(smallerBoss2);
		smallerBoss2.add(employee2);
		
		System.out.println(smallerBoss2);
		System.out.println(employee2);
	}

}
