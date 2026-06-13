package S;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
public class s21 {
	public static void main(String [] args)
	{
		//sort the employees
		List<Employee> employees=Arrays.asList( 
				new Employee("hari","IT",88000),
				new Employee("ganesh","IT",88000),
				new Employee("rahul","IT",55000),
				new Employee("mahesh","IT",65000));
		Comparator<Employee> sortingcomp=Comparator.comparing(Employee::getSalary,Comparator.reverseOrder());
		
		List<Employee> sor=employees.stream()
				.sorted(sortingcomp)
				.collect(Collectors.toList());
	   sor.forEach(System.out::println);
		
					
	}

}
