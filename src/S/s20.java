package S;
import java.util.*;
public class s20 {
	public static void main(String [] args)
	{
			List<Integer> numbers=Arrays.asList(1,100,99,23,14,134,7,2,35,6,28);
			
			numbers.stream().sorted().forEach(System.out::println);
			
			
	}
}
