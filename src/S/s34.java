package S;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner.*;
public class s34 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Map<Character,Long> m=s.chars()
			.mapToObj(i->(char)i)
			.collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
	
	
	Optional<Character> gi=	m.entrySet().stream()
			.filter(e->e.getValue()==1)
			.map(Map.Entry::getKey)
			.findFirst();

	System.out.println(gi);
	}
}
