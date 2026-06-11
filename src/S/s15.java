package S;
import java.util.*;
public class s15 {
	public static void main(String [] args)
	{
		List<String> names=Arrays.asList("harinath","aravind","jawahar nagar","rahul","abhi",null,null);
		
		names.stream().filter(s->s!=null).forEach(System.out::println);
		
		
	}

}
