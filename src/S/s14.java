package S;
import java.util.*;
public class s14 {
	public static void main(String [] args)
	{
		List<Integer> n=List.of(10, 20, 10, 30, 20, 40, 50, 40);
		
		Optional<Integer> nnn=n.stream().findFirst();
		System.out.println(nnn.orElse(0));
	}

}
