
public class Main {
	
	public static final int a=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("0001","user 1","Bengaluru",10000.0f);
		Manager manager=new Manager("Zee", 100.0f);
		
		System.out.println("Manager: "+manager);
		
		System.out.println("Manager Salary: "+manager.calculateSalary());
		
	}

}
