package S;
import java.util.*;
import java.util.stream.*;
public class s6 {
	public static void main(String [] args)
	{
		List<Integer> number=List.of(1,2,3,4,5,6,7,8,9,10);
		
		number.stream()
		.filter(n->n%2==0)
		.map(n->n*n)
		.forEach(System.out::println);
	}

}
