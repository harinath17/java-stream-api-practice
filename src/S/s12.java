package S;
import java.util.*;
public class s12 {
	public static void main(String [] args)
	{
		//GET FIRST 3 ELEMENT
		List<Integer> n=List.of(10, 20, 10, 30, 20, 40, 50, 40);
		
		n.stream().limit(3).forEach(System.out::println);
	}

}
