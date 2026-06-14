package S;
import java.util.*;
import java.util.stream.*;
public class S26 {
	public static void main(String [] args)
	{
		List<Employee> emp=Arrays.asList(
				new Employee("hari","it",80000),
				new Employee("ganesh","it",60000),
				new Employee("sairam","it",60000),
				new Employee("yasir","doctor",55555),
				new Employee("rahul","manager",55325)
				);
	
		
		Map<String,Long> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(map);
		
		// Alternative implementation using toMap
		Map<String, Long> map1 = emp.stream()
		    .collect(Collectors.toMap(
		        Employee::getDepartment, 
		        e -> 1L, 
		        Long::sum
		    ));

	}

}
