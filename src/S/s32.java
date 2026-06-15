package S;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class s32 {

	public static void main(String [] args)
	{
	List<List<Integer>> i_p = List.of(
            List.of(1, 2, 3),
            List.of(4, 5),
            List.of(6, 7, 8, 9)
        );
	
	List<Integer> n=i_p.stream().flatMap(List::stream).collect(Collectors.toList());
	
    System.out.println(n);
	
}
}
