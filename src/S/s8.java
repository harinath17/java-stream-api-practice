package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s8 {
public static void main(String [] args)
{
	List<String> n=List.of("hari","rahul","abhi","ganesh");
	
	Set<String> ne=n.stream().collect(Collectors.toSet());
	System.out.println(ne);
}
}
