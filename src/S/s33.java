package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s33 {
	public static void main(String [] args)
	{
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
		
		List<Integer> n=numbers.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(n);
		
	}

}
