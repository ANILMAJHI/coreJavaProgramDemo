import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	private int empId;
	private String name;
	private String address;
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, String address, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {

		Double e1 = emp1.getSalary();
		Double e2 = emp2.getSalary();
		return e1.compareTo(e2);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
