package S;
import java.util.*;
import java.util.stream.Collectors;
public class s9 {
	public static void main(String [] args)
	{
		List<String> n=List.of("hari","rahul","abhi","ganesh");
		
		String s=n.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(s);
	}
	

}
