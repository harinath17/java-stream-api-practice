package S;
import java.util.*;
import java.util.Scanner.*;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.Map.*;
public class s35 {

public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Character  m = s.chars()
			.mapToObj(i->(char)i)
			.collect(Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream().filter(entry->entry.getValue()==1)
			.map(Map.Entry::getKey)
			.findFirst()
			.orElse(null);
	System.out.println(m);
	
	}

}
