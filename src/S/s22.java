package S;
import java.util.*;
import java.util.stream.Collectors;
public class s22 {
	public static void main(String [] args)
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "IT", 80000),
			    new Employee("Charlie", "HR", 50000),
			    new Employee("Bob", "IT", 90000),
			    new Employee("David", "HR", 50000),
			    new Employee("Eva", "IT", 80000)
			);
		
	/*	employees.stream().sorted().forEach(System.out::println); */
	
			Comparator<Employee> employeecomparator=Comparator.comparing(Employee::getDepartment)
					.thenComparing(Employee::getSalary,Comparator.reverseOrder());
			List<Employee> sortedEmployees=employees.stream()
					.sorted(employeecomparator)
					.collect(Collectors.toList());
			sortedEmployees.forEach(System.out::println);
		
	}

}
