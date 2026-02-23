package Accenture;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private Double salary;
	private String department;

	public Employee(int id, String name, Double salary, String department) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public class Main {
		
		public static void main(String[] args) {
			List<Employee> employees = Arrays.asList(
					
					new Employee(1,"Harish",50000.0,"IT"),
					new Employee(2,null,70000.0,"HR"),
					new Employee(3,"Anu",null,"IT"),
					new Employee(4,"Kiran",45000.0,null),
					null);
			
			System.out.println("=== Employees with Non-Null Values ===");

			  List<Employee> filteredEmployees = employees.stream()
		                .filter(Objects::nonNull) // remove null objects
		                .filter(emp -> emp.getName() != null)
		                .filter(emp -> emp.getSalary() != null)
		                .filter(emp -> emp.getDepartment() != null)
		                .collect(Collectors.toList());

		        filteredEmployees.forEach(System.out::println);
		}
	}
}




