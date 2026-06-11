package S;
import java.util.*;
public class s13 {
	public static void main(String [] args)
	{
		List<Integer> n=List.of(10, 20, 10, 30, 20, 40, 50, 40);
		
		n.stream().skip(2).forEach(System.out::println);
	}

}
