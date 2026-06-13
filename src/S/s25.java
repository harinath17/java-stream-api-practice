package S;
import java.util.*;
import java.util.stream.*;
public class s25 {
	public static void main(String [] args)
	{
		
		List<Employee> emp=Arrays.asList(
				new Employee("hari","it",80000),
				new Employee("ganesh","it",60000),
				new Employee("sairam","it",60000),
				new Employee("yasir","doctor",55555),
				new Employee("rahul","manager",55325)
				);
		
		Map<String,List<Employee>> employeesByDept=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		employeesByDept.forEach((dept,emplist)->
		{
	System.out.println(dept +" Department:"+emplist);
		});
	
	
	}

}
