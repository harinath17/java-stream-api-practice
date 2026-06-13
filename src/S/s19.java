package S;
import java.util.*;
public class s19 {
	public static void main(String [] args)
	{
		//maximum elemetn of the number using max
		 List<Integer> number=Arrays.asList(5,10,15,20);
		 
	/*	 Optional<Integer> max=number.stream().max(Integer::compareTo);
		 
		 System.out.println(max.orElse(0));
	*/
		 // maximum elemetn of the number using reduce
		 
		 Optional<Integer> max=number.stream().reduce(Integer::max);
		 System.out.println(max.orElse(0));
		 
		 
		 
		 
	}

}
