package S;
import java.util.*;
import java.util.stream.*;
public class s24 {
	public static void main(String [] args)
	{
		List<Integer> n=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		Map<Boolean,List<Integer>> partition=n.stream()
				.collect(Collectors.partitioningBy(nd->nd>10));
	   List<Integer>greaterThanten=partition.get(true);
	   List<Integer>lessthanequaltoten=partition.get(false);
	   System.out.println("number>10"+greaterThanten);
	   System.out.println("number<=10"+lessthanequaltoten);
 }

}
