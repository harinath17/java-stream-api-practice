package S;
import java.util.*;
import java.util.stream.*;
public class s4 {
	public static void main(String [] args)
	{
		List<String> names=Arrays.asList("harinath","aravind","jawahar nagar","rahul","abhi");
		names.stream().filter(n->n.toLowerCase().startsWith("a")).forEach(System.out::println);
	}

}
