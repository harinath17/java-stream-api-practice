package S;
import java.util.*;
import java.util.stream.Collectors;
public class s36 {
	public static void main(String [] args)
	{
		List<Integer> lst = List.of(1, 3, 2, 1, 4, 1, 3, 2, 1, 1);
		
		Optional<Integer> fr=lst.stream()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()))
	            .entrySet().stream().max(Map.Entry.comparingByValue())
	            .map(Map.Entry::getKey);
		
		System.out.println(fr);
	}

}
