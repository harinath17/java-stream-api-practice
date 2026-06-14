package S;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class s28 {
	public static void main(String [] args)
	{
	List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

	List<String> map=list.stream()
			.collect(Collectors
			.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().filter(entry->entry.getValue()>1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
	System.out.println(map);
	
	//
	Set<String> seen=new HashSet<>();
	Set<String> du=list.stream()
			.filter(n->!seen.add(n))
			.collect(Collectors.toSet());
	System.out.println(du);
	
	}
}
