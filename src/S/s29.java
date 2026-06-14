package S;
import java.util.*;
import java.util.List;
import java.util.stream.*;

public class s29 {
	public static void main(String [] args)
	{
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		List<String> list2 = Arrays.asList("banana", "date", "apple");

		List<String> n=Stream.concat(list1.stream(),list2.stream())
				.collect(Collectors.toList());
	
		System.out.println(n);
	}

}
