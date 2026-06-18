package morepractices;
import java.util.List.*;
import java.util.List;
import java.util.Arrays.*;
import java.util.*;
import java.util.stream.*;
public class MergetwoandRemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(4,5,6,7,8);
		
		List<Integer> merge=Stream.concat(l1.stream(),l2.stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(merge);
		

	}

}
