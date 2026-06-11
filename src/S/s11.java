package S;
import java.util.*;
import java.util.stream.Collectors;
public class s11 {
	public static void main(String [] args)
	{
	   //remove duplicates using stream 
		List<Integer> n=List.of(10, 20, 10, 30, 20, 40, 50, 40);
		
		List<Integer> rem=n.stream().distinct().collect(Collectors.toList());
	}

}
