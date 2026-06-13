package S;
import java.util.*;
public class s18 {
	public static void main(String [] args)
	{
		//product of the number using reduce
		 List<Integer> number=Arrays.asList(5,10,15,20);
		 
		 Optional<Integer> product=number.stream()
				 .reduce((a,b)->a*b);
		 System.out.println("product :"+product.orElse(0));
	}

}
