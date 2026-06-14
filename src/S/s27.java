package S;
import java.util.*;
import java.util.stream.Collectors;
public class s27 {
	public static void main(String [] args)
	{
		List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

		Map<String,Long> map=list.stream()
				.collect(Collectors
						.groupingBy(word->word,Collectors.counting()));
		//System.out.println(map);
		map.forEach((element,count)->System.out.println(element+" "+count));
		
		
	}

}
