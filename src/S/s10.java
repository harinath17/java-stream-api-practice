package S;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class s10 {
	public static void main(String [] args)
	{
		List<String> k=List.of("a","b","c","a","b","c");
		
		Map<String,Long> d=k.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(d);
	}

}
