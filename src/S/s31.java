package S;
import java.util.*;
import java.util.Optional;
public class s31 {
	public static void main(String [] args)
	{
	    List<String> n=List.of("harl","mahesh","yasir","johnchandra");
	    
	    Optional<String> maxlength=n.stream().max(Comparator.comparing(String::length));
	    
	    System.out.println(maxlength);
	    
		
		
	}

}
