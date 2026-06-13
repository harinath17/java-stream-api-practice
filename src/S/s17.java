package S;
import java.util.*;
public class s17 {
	public static void main(String [] args )
	{
		//sum of the number using reduce
		 List<Integer> number=Arrays.asList(5,10,15,20);
		
	/*	Optional<Integer> sum=number.stream()
								.reduce((a,b)->a+b);
		System.out.println("sum:"+sum.orElse(0));*/
		//sum of the number using sum
		
		 int sum=number.stream()
				 .mapToInt(Integer::intValue)
				 .sum();
		 System.out.println("sum:"+sum);
	}
}
