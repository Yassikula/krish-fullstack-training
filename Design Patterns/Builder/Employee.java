package Builder;

public class Employee {
	
	
	private final String name;
	private final String empID;
	private final String address;
	private final int age;
	private final String department;
	
	public Employee(EBuilder eBuilder) {
		this.name= eBuilder.name;
		this.empID= eBuilder.empID;
		this.address= eBuilder.address;
		this.age= eBuilder.age;
		this.department= eBuilder.department;
	}

	
    static class EBuilder{
    	
    	private String name;
    	private String empID;
    	private String address;
    	private int age;
    	private String department;
    	
    	public Employee build() {
    		return new Employee(this);
    	}
    	
    	public EBuilder(String empID) {
    		this.empID = empID;
    		
    	}
    	
    	public EBuilder name(String name){
    		this.name = name;
    		return this;
    	}
    	public EBuilder empID(String empID){
    		this.empID = empID;
    		return this;
    	}
    	public EBuilder address(String address){
    		this.address = address;
    		return this;
    	}
    	public EBuilder age(int age){
    		this.age = age;
    		return this;
    	}
    	public EBuilder department(String department){
    		this.department = department;
    		return this;
    	}
    }
		@Override
		public String toString() {
			return "EBuilder [name=" + name + ", empID=" + empID + ", address=" + address + ", age=" + age
					+ ", department=" + department + "]";
		}
    	
	}


