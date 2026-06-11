package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s7 {
	public static void main(String [] args)
	{
		
		Stream<String> n=Stream.of("a","b","c");
		List<String> list=n.collect(Collectors.toList());
		System.out.println(list);
	   
	}
	

}
