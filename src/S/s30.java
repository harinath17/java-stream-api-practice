package S;
import java.util.*;
import java.util.stream.*;

public class s30 {
	public static void main(String [] args)
	{
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		List<String> list2 = Arrays.asList("banana", "date", "apple");
		
		List<String> l=list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(l);
	}

}
