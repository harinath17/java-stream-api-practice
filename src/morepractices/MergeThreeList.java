package morepractices;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.*;
public class MergeThreeList {
	public static void main(String [] args)
	{
	List<Integer> l1 = Arrays.asList(1,2,3,4,5);
	List<Integer> l2 = Arrays.asList(4,5,6,7,8);
	List<Integer> l3=Arrays.asList(10,11,12,13,14);
	
	List<Integer> n1=Stream.concat(l1.stream(),l2.stream())
			.distinct()
			.collect(Collectors.toList());
	
	List<Integer> threelist=Stream.concat(n1.stream(),l3.stream())
			.sorted(Comparator.reverseOrder())
			
			.collect(Collectors.toList());
	
	System.out.print(threelist);
	

}
}