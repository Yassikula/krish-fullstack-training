package Builder;

public class Application {

	public static void main(String[] args) {
		
		Employee.EBuilder bil = new Employee.EBuilder("AC001");
		Employee em = bil.address("Colombo").age(30).build();
		
		System.out.println(em);
	}
}
