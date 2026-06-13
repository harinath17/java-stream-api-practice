package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s23 {
	public static void main(String [] args)
	{
		List<Integer> n=List.of(1,2,3,4,5,6,7,8,9,10);
		
		Map<Object, List<Integer>> numbers=n.stream()
				.collect(Collectors.groupingBy(nd->nd%2==0));
		System.out.println(numbers);
	}

}
