package Project;


public class Employee extends Person {
    private String employeeID;
    private double salary;
    
    
    public Employee(String firstName, String lastName, int phone, String employeeID, double salary) {
    	
        super(firstName, lastName, phone );
        this.employeeID =  employeeID;
        this.salary = salary;
        
    }

   
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID =  employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", salary=" + salary 
				+ ", FirstName=" + getFirstName() + ", LastName="
				+ getLastName() + ", Phone=" + getPhone() +  "]";
	}
	
	public String toStringData() {
		return employeeID + "," + getFirstName() + "," +getLastName()+ "," + getPhone() + "," + salary + "\n";
	}
	



}