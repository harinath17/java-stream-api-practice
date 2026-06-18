package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=Arrays.asList( 
				new Employee("hari","IT",88000),
				new Employee("ganesh","IT",81000),
				new Employee("rahul","IT",55000),
				new Employee("mahesh","IT",65000));
		Optional<Double> secondhighestsalary = employees.stream()
				.map(Employee::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		System.out.println(secondhighestsalary);
	}

}
